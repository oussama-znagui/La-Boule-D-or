package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.tournamentPlayers.TournamentPlayersRequestDTO;
import ma.znagui.bouledor.dto.tournamentPlayers.TournamentPlayersResponseDTO;
import ma.znagui.bouledor.entity.IndividualTournament;
import ma.znagui.bouledor.entity.TournamentPlayers;
import ma.znagui.bouledor.mapper.TournamentPlayersMapper;
import ma.znagui.bouledor.repository.TournamentPlayersRepository;
import ma.znagui.bouledor.service.TournamentPlayersService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TournamentPlayersServiceImpl  implements TournamentPlayersService {
    private final TournamentPlayersMapper tournamentPlayersMapper;
    private final TournamentPlayersRepository tournamentPlayersRepository;




    public TournamentPlayersResponseDTO addPlayerToTournament(TournamentPlayersRequestDTO dto) {
        TournamentPlayers tournamentPlayers = tournamentPlayersMapper.requestDTOtoTournamentPlayers(dto);
        

        System.out.println(tournamentPlayers.getTournament() instanceof IndividualTournament);


        return null;
    }
}
