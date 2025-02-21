package ma.znagui.bouledor.service;

import ma.znagui.bouledor.dto.stage.StageRequestDTO;
import ma.znagui.bouledor.dto.stage.StageResponseDTO;

public interface StageService {
    StageResponseDTO createStage(StageRequestDTO dto);
    StageResponseDTO getOneStage(Long id);
    StageResponseDTO updateStage(StageRequestDTO dto);
    String deleteStage(Long id);


}
