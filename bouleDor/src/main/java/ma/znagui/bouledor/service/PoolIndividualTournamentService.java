package ma.znagui.bouledor.service;

import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentRequestDTO;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentResponseDTO;

public interface PoolIndividualTournamentService {

    PoolIndividualTournamentResponseDTO createIndividualTournament(PoolIndividualTournamentRequestDTO dto);
    PoolIndividualTournamentResponseDTO getOneIndividualTournament(Long id);
    PoolIndividualTournamentResponseDTO updateIndividualTournament(Long id, PoolIndividualTournamentRequestDTO dto);
    
}
