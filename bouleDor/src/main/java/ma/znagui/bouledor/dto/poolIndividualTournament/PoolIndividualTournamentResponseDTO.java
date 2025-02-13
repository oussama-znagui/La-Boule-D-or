package ma.znagui.bouledor.dto.poolIndividualTournament;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.bouledor.dto.club.ClubEmbdedDTO;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.TournrmrntStatus;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PoolIndividualTournamentResponseDTO {
    private Long id;
    private String title;
    private TournamentType type;
    private int numberOfPlayers;
    private LocalDate startDate;
    private LocalDate endDate;
    private String rules;
    private String prize;
    private TournrmrntStatus status;
    private TounamentMode mode;
    private ClubEmbdedDTO hostingClub;

}
