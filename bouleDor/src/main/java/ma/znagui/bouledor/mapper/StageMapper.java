package ma.znagui.bouledor.mapper;


import ma.znagui.bouledor.dto.stage.StageRequestDTO;
import ma.znagui.bouledor.dto.stage.StageResponseDTO;
import ma.znagui.bouledor.entity.Stage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StageMapper {

    Stage requestDTOtoStage(StageRequestDTO dto);
    StageResponseDTO stageToResponseDTO(Stage stage);
}
