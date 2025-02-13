package ma.znagui.bouledor.mapper;

import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentRequestDTO;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentResponseDTO;
import ma.znagui.bouledor.entity.PoolIndividualTournament;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PoolIndividualTournamentMapper {

    PoolIndividualTournament RequestDTOtoPoolIndividualTournament(PoolIndividualTournamentRequestDTO dto);
    PoolIndividualTournamentResponseDTO poolIndividualTournamentToResponseDTO(PoolIndividualTournament poolIndividualTournament);
}
