package ma.znagui.bouledor.dto.clubsTournament;


import lombok.Getter;
import ma.znagui.bouledor.dto.club.ClubEmbdedDTO;
import ma.znagui.bouledor.dto.tournament.TournamentResponseDTO;
import ma.znagui.bouledor.dto.tournamentPlayers.TournamentPlayersEmbdedDTO;
import ma.znagui.bouledor.enums.Status;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.enums.TournamentType;

import java.time.LocalDate;
import java.util.List;

@Getter
public class ClubsTournamentResponseDTO  extends TournamentResponseDTO {
    private int numberOfTeams;


    public ClubsTournamentResponseDTO(Long id, String title, TournamentType type, int numberOfPlayers, LocalDate startDate, LocalDate endDate, String rules, String prize, Status status, TounamentMode mode, TournamentFormat format, ClubEmbdedDTO hostingClub, List<TournamentPlayersEmbdedDTO> players, int numberOfTeams) {
        super(id, title, type, numberOfPlayers, startDate, endDate, rules, prize, status, mode, format, hostingClub, players);
        this.numberOfTeams = numberOfTeams;
    }
}
