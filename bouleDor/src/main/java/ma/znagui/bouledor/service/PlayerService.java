package ma.znagui.bouledor.service;

import ma.znagui.bouledor.dto.auth.PlayerCreateDTO;
import ma.znagui.bouledor.dto.player.PlayerResponseDTO;

import java.util.List;

public interface PlayerService {
    PlayerResponseDTO createPlayer(PlayerCreateDTO dto);
    PlayerResponseDTO getPlayerById(Long id);
    List<PlayerResponseDTO> getAllPlayers();
//    PlayerResponseDTO updatePlayer(Long id, PlayerCreateDTO);
    void deletePlayer(Long id);
}
