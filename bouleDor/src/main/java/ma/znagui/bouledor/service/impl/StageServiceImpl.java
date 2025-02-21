package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.stage.StageRequestDTO;
import ma.znagui.bouledor.dto.stage.StageResponseDTO;
import ma.znagui.bouledor.mapper.StageMapper;
import ma.znagui.bouledor.repository.StageRepository;
import ma.znagui.bouledor.service.StageService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class StageServiceImpl implements StageService {
    private final StageRepository stageRepository;
    private final StageMapper stageMapper;


    public StageResponseDTO createStage(StageRequestDTO dto) {

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
