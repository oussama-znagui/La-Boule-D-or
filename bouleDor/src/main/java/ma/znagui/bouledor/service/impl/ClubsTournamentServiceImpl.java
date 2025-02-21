package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.clubsTournament.ClubsTournamentRequestDTO;
import ma.znagui.bouledor.dto.clubsTournament.ClubsTournamentResponseDTO;
import ma.znagui.bouledor.entity.ClubsTournament;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.Status;
import ma.znagui.bouledor.exception.DatesAreNotValidException;
import ma.znagui.bouledor.exception.InvalidTournamentTypeExcepion;
import ma.znagui.bouledor.exception.NumberOfPlayersIsInvalidException;
import ma.znagui.bouledor.exception.ResourceNotFoundExeption;
import ma.znagui.bouledor.mapper.ClubsTournamentMapper;
import ma.znagui.bouledor.repository.ClubsTournamentRepository;
import ma.znagui.bouledor.service.ClubService;
import ma.znagui.bouledor.service.ClubsTournamentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@AllArgsConstructor
@Service
public class ClubsTournamentServiceImpl implements ClubsTournamentService {
    private final ClubsTournamentRepository clubsTournamentRepository;
    private final ClubsTournamentMapper clubsTournamentMapper;
    private final ClubService clubService;


    public ClubsTournamentResponseDTO createClubsTournament(ClubsTournamentRequestDTO dto) {
        ClubsTournament clubsTournament = clubsTournamentMapper.requestDTOtoClubsTOurnament(dto);

        if (clubsTournament.getType() == TournamentType.CLUB_LEVEL){
            throw new InvalidTournamentTypeExcepion("tournoi des club ne peux pas etre creer avec le type CLUB_LEVEL ");
        }


        if (clubsTournament.getStartDate() == null && clubsTournament.getEndDate() == null ){
            throw new DatesAreNotValidException();
        }else {
            if (clubsTournament.getEndDate().isBefore(clubsTournament.getStartDate()) || clubsTournament.getStartDate().isBefore(LocalDate.now())) {
                throw new DatesAreNotValidException();
            }
        }

        if (!verifyNumberOfTeams(clubsTournament.getNumberOfTeams()) && clubsTournament.getFormat() == TournamentFormat.KNOCKOUT){
            throw new NumberOfPlayersIsInvalidException();
        }

        clubsTournament.setStatus(Status.SCHEDULED);

        clubsTournament.setHostingClub(clubService.getClubEntityById(clubsTournament.getHostingClub().getId()));

        return clubsTournamentMapper.clubsTournamentToResponseDTO(clubsTournamentRepository.save(clubsTournament));
    }

    public ClubsTournamentResponseDTO getOneClubsTournament(Long id) {
        ClubsTournament clubsTournament = clubsTournamentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Club Tournament",id));
        return clubsTournamentMapper.clubsTournamentToResponseDTO(clubsTournament);
    }


    public ClubsTournament getClubsTournamentEntityById(Long id) {
        return clubsTournamentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Club Tournament",id));
    }


    private Boolean verifyNumberOfTeams(int n){
        while (n % 2 == 0){
            n = n/2;
        }
        return n == 1;

    }
}
