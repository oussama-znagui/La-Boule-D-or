package ma.znagui.bouledor.dto.clubsTournament;

import ma.znagui.bouledor.dto.club.ClubEmbdedDTO;
import ma.znagui.bouledor.dto.tournament.TournamentEmbdedDTO;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.Status;

import java.time.LocalDate;

public class ClubsTournamentEmbdedDTO extends TournamentEmbdedDTO {
    private int numberOfTeams;
    public ClubsTournamentEmbdedDTO(Long id, String title, TournamentType type, int numberOfPlayers, LocalDate startDate, LocalDate endDate, String rules, String prize, Status status, TounamentMode mode, TournamentFormat format, ClubEmbdedDTO hostingClub, int numberOfTeams) {
        super(id, title, type, numberOfPlayers, startDate, endDate, rules, prize, status, mode, format, hostingClub);
        this.numberOfTeams = numberOfTeams;
    }
}
