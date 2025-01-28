package ma.znagui.bouledor.service;

import ma.znagui.bouledor.dto.club.ClubCreateDTO;
import ma.znagui.bouledor.dto.club.ClubResponseDTO;

import java.util.List;

public interface ClubService {
    ClubResponseDTO createClub(ClubCreateDTO dto);
    ClubCreateDTO getOneClub(Long id);
    List<ClubResponseDTO> getAllClubs();
    ClubResponseDTO updateClub(Long id, ClubCreateDTO dto);
    void deleteClub(Long id);
}
