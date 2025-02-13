package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentRequestDTO;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentResponseDTO;
import ma.znagui.bouledor.entity.PoolIndividualTournament;
import ma.znagui.bouledor.mapper.PoolIndividualTournamentMapper;
import ma.znagui.bouledor.repository.PoolIndividualTournamentRepository;
import ma.znagui.bouledor.service.PoolIndividualTournamentService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PoolIndividualTournamentServiceImpl implements PoolIndividualTournamentService {
    private final PoolIndividualTournamentRepository repository;
    private final PoolIndividualTournamentMapper mapper;


    private Boolean verifyNumberOfPlayers(int n){
        while (n % 2 == 0){
            n = n/2;
        }
        return n == 1;

    }


    public PoolIndividualTournamentResponseDTO createIndividualTournament(PoolIndividualTournamentRequestDTO dto) {
        PoolIndividualTournament poolIndividualTournament = mapper.RequestDTOtoPoolIndividualTournament(dto);
        System.out.println(verifyNumberOfPlayers(poolIndividualTournament.getNumberOfPlayers()));

        return null;
    }

    public PoolIndividualTournamentResponseDTO getOneIndividualTournament(Long id) {
        return null;
    }

    public PoolIndividualTournamentResponseDTO updateIndividualTournament(Long id, PoolIndividualTournamentRequestDTO dto) {
        return null;
    }
}
