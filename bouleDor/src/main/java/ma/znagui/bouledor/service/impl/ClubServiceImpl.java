package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.club.ClubCreateDTO;
import ma.znagui.bouledor.dto.club.ClubResponseDTO;
import ma.znagui.bouledor.entity.Club;
import ma.znagui.bouledor.mapper.ClubMapper;
import ma.znagui.bouledor.repository.ClubRepository;
import ma.znagui.bouledor.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClubServiceImpl implements ClubService {
    private final ClubMapper clubMapper;
    private final ClubRepository clubRepository;

    public ClubResponseDTO createClub(ClubCreateDTO dto) {
        Club club = clubMapper.createDTOtoClub(dto);
        return clubMapper.clubToResponseDTO(clubRepository.save(club));
    }

    public ClubCreateDTO getOneClub(Long id) {
        return null;
    }

    public List<ClubResponseDTO> getAllClubs() {
        return List.of();
    }

    public ClubResponseDTO updateClub(Long id, ClubCreateDTO dto) {
        return null;
    }

    public void deleteClub(Long id) {

    }
}
