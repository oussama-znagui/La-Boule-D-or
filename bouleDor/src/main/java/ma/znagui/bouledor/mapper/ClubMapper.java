package ma.znagui.bouledor.mapper;

import ma.znagui.bouledor.dto.club.ClubCreateDTO;
import ma.znagui.bouledor.dto.club.ClubResponseDTO;
import ma.znagui.bouledor.entity.Club;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClubMapper {

    Club createDTOtoClub(ClubCreateDTO dto);
    ClubResponseDTO clubToResponseDTO(Club club);
}
