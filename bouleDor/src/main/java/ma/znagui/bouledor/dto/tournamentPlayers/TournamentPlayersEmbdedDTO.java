package ma.znagui.bouledor.dto.tournamentPlayers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.bouledor.dto.player.PlayerEmbdedDTO;

@Getter
@AllArgsConstructor
public class TournamentPlayersEmbdedDTO {
    private PlayerEmbdedDTO player;
    private String note;
}
