package ma.znagui.bouledor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.znagui.bouledor.enums.TounamentMode;
import ma.znagui.bouledor.enums.TournamentFormat;
import ma.znagui.bouledor.enums.TournamentType;
import ma.znagui.bouledor.enums.TournrmrntStatus;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    private TournamentFormat format;

    @ManyToOne
    private Club hostingClub;

    @OneToMany(mappedBy = "tournament")
    private List<Defie> defies;

    @OneToMany(mappedBy = "tournament")
    private List<TournamentPlayers> players;



}
