package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.poolClubsTournamentClubs.PoolClubsTournamentClubsRequestDTO;
import ma.znagui.bouledor.dto.poolClubsTournamentClubs.PoolClubsTournamentClubsResponseDTO;
import ma.znagui.bouledor.mapper.PoolClubsTournamentClubsMapper;
import ma.znagui.bouledor.repository.PoolClubsTournamentClubsRepository;
import ma.znagui.bouledor.service.ClubService;
import ma.znagui.bouledor.service.ClubsTournamentService;
import ma.znagui.bouledor.service.PoolClubsTournamentClubsService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PoolClubsTournamentClubsServiceImpl implements PoolClubsTournamentClubsService {
    private final PoolClubsTournamentClubsRepository repository;
    private final PoolClubsTournamentClubsMapper mapper;
    private final ClubsTournamentService clubsTournamentService;
    private ClubService clubService;


    public PoolClubsTournamentClubsResponseDTO addClubToTournament(PoolClubsTournamentClubsRequestDTO dto) {
        return null;
    }
}
