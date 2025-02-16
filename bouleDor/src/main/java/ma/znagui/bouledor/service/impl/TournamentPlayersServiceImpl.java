package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.tournamentPlayers.TournamentPlayersRequestDTO;
import ma.znagui.bouledor.dto.tournamentPlayers.TournamentPlayersResponseDTO;
import ma.znagui.bouledor.entity.ClubsTournament;
import ma.znagui.bouledor.entity.IndividualTournament;
import ma.znagui.bouledor.entity.Tournament;
import ma.znagui.bouledor.entity.TournamentPlayers;
import ma.znagui.bouledor.exception.TournamentMaxPlayersReachedException;
import ma.znagui.bouledor.mapper.TournamentPlayersMapper;
import ma.znagui.bouledor.repository.TournamentPlayersRepository;
import ma.znagui.bouledor.service.PlayerService;
import ma.znagui.bouledor.service.TournamentPlayersService;
import ma.znagui.bouledor.service.TournamentService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TournamentPlayersServiceImpl  implements TournamentPlayersService {
    private final TournamentPlayersMapper tournamentPlayersMapper;
    private final TournamentPlayersRepository tournamentPlayersRepository;
    private final TournamentService tournamentService;
    private final PlayerService playerService;





    public TournamentPlayersResponseDTO addPlayerToTournament(TournamentPlayersRequestDTO dto) {
        TournamentPlayers tournamentPlayers = tournamentPlayersMapper.requestDTOtoTournamentPlayers(dto);

        tournamentPlayers.setPlayer(playerService.getPlayerEntityById(dto.getPlayer_id()));
        Tournament tournament = tournamentService.getTournamentEntityById(dto.getTournement_id());
        tournamentPlayers.setTournament(tournament);

        if (tournament instanceof ClubsTournament){
            if (((ClubsTournament) tournament).getClubs().size() < tournament.getNumberOfPlayers()){

            }
        }

       if (tournament.getPlayers().size() == tournament.getNumberOfPlayers()){
            throw new TournamentMaxPlayersReachedException(tournament.getNumberOfPlayers());
       }



        return tournamentPlayersMapper.tournementPlayersToResponseDTO(tournamentPlayers);
    }
}
