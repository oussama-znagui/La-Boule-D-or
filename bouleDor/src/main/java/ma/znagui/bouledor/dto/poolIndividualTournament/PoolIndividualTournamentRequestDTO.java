package ma.znagui.bouledor.dto.poolIndividualTournament;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.TournrmrntStatus;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class PoolIndividualTournamentRequestDTO {
    @NotBlank(message = "Le Titre du tournoi")
    private String title;
    private TournamentType type;
    @NotNull(message = "le nombre du joueur (4 - 8 - 16 - 32 - 64 - 128)")
    @Min(2)
    private int numberOfPlayers;

    private LocalDate startDate;

    private LocalDate endDate;
    @NotBlank(message = "Les regles du tournoi")
    private String rules;
    @NotBlank(message = "Prize SVP!")
    private String prize;

    private TournrmrntStatus status;

    private TounamentMode mode;

    @NotNull(message = "Club d'hébergement SVP!")
    private Long hostingClub_id;

}
