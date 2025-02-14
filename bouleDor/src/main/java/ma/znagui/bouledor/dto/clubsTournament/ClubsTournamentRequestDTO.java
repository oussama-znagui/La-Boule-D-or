package ma.znagui.bouledor.dto.clubsTournament;


import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.bouledor.dto.tournament.TournamentRequestDTO;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentType;

import java.time.LocalDate;
@Getter
public class ClubsTournamentRequestDTO extends TournamentRequestDTO {

    @Min(4)
    private int numberOfTeams;

    public ClubsTournamentRequestDTO(String title, TournamentType type, int numberOfPlayers, LocalDate startDate, LocalDate endDate, String rules, String prize, TounamentMode mode, Long hostingClub_id,int numberOfTeams) {

        super(title, type, numberOfPlayers, startDate, endDate, rules, prize, mode, hostingClub_id);
        this.numberOfTeams = numberOfTeams;
    }

}
