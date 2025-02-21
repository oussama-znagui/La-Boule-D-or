package ma.znagui.bouledor.dto.tournament;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.bouledor.dto.club.ClubEmbdedDTO;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.Status;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class TournamentEmbdedDTO {
    private Long id;
    private String title;
    private TournamentType type;
    private int numberOfPlayers;
    private LocalDate startDate;
    private LocalDate endDate;
    private String rules;
    private String prize;
    private Status status;
    private TounamentMode mode;
    private TournamentFormat format;
    private ClubEmbdedDTO hostingClub;
}
