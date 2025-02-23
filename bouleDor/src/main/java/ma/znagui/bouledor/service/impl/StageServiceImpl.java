package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.stage.StageRequestDTO;
import ma.znagui.bouledor.dto.stage.StageResponseDTO;
import ma.znagui.bouledor.entity.ClubsTournament;
import ma.znagui.bouledor.entity.IndividualTournament;
import ma.znagui.bouledor.entity.Stage;
import ma.znagui.bouledor.entity.Tournament;
import ma.znagui.bouledor.enums.StageLevel;
import ma.znagui.bouledor.enums.StageType;
import ma.znagui.bouledor.enums.Status;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.exception.DatesAreNotCompatibleWithTournamentException;
import ma.znagui.bouledor.exception.DatesAreNotValidException;
import ma.znagui.bouledor.mapper.StageMapper;
import ma.znagui.bouledor.repository.StageRepository;
import ma.znagui.bouledor.service.StageService;
import ma.znagui.bouledor.service.TournamentService;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class StageServiceImpl implements StageService {
    private final StageRepository stageRepository;
    private final StageMapper stageMapper;
    private final TournamentService tournamentService;


 public   Boolean isTournamentStagesDurationValid(Tournament tournament){
     int totalStage = 0;
     if (tournament instanceof ClubsTournament && tournament.getFormat() == TournamentFormat.POINT_BASED){
          totalStage = ((ClubsTournament) tournament).getNumberOfTeams() - 1;
     }
     if (tournament instanceof ClubsTournament && tournament.getFormat() == TournamentFormat.KNOCKOUT){
         totalStage = (int) Math.ceil(Math.log(((ClubsTournament) tournament).getNumberOfTeams()) / Math.log(2));
     }
     if (tournament instanceof IndividualTournament && tournament.getFormat() == TournamentFormat.POINT_BASED){
         totalStage = ((IndividualTournament) tournament).getNumberOfPlayers() - 1;
     }
     if (tournament instanceof IndividualTournament && tournament.getFormat() == TournamentFormat.KNOCKOUT){
         totalStage = (int) Math.ceil(Math.log(((IndividualTournament) tournament).getNumberOfPlayers()) / Math.log(2));
     }

     return false;

   }


    public List<Stage> generateTournamentStages(Tournament tournament) {
        List<Stage> stages = new ArrayList<>();

        if (tournament instanceof ClubsTournament && tournament.getFormat() == TournamentFormat.POINT_BASED){
            int totalStage = ((ClubsTournament) tournament).getNumberOfTeams() - 1;

            long days =  ChronoUnit.DAYS.between(tournament.getStartDate(),tournament.getEndDate());
            System.out.println(days);

            for (int i = 0; i < totalStage ; i++){
                Stage stage = new Stage();
                stage.setRoundNumber(i + 1);
                stage.setStatus(Status.SCHEDULED);
                stage.setType(StageType.POINT_BASED);
                stage.setLevel(StageLevel.POINTS_STAGE_GROUP);
                stage.setTournament(tournament);
                stages.add(stage);

//                System.out.println(stage);


                stageRepository.save(stage);


            }

        }

        return stages;
    }


    public StageResponseDTO createStage(StageRequestDTO dto) {
        Stage stage = stageMapper.requestDTOtoStage(dto);

        if (stage.getStartDate() == null || stage.getEndDate() ==null){
            throw new DatesAreNotValidException();
        }
        if (stage.getStartDate().isAfter(stage.getEndDate())){
            throw new DatesAreNotValidException();
        }

        Tournament tournament = tournamentService.getTournamentEntityById(stage.getTournament().getId());

        if (tournament.getStartDate().isAfter(stage.getStartDate()) || tournament.getEndDate().isBefore(stage.getEndDate())){
            throw new DatesAreNotCompatibleWithTournamentException(tournament.getStartDate(),tournament.getEndDate());
        }





        return null;
    }

    public StageResponseDTO getOneStage(Long id) {
        return null;
    }

    public StageResponseDTO updateStage(StageRequestDTO dto) {
        return null;
    }

    public String deleteStage(Long id) {
        return "";
    }



}
