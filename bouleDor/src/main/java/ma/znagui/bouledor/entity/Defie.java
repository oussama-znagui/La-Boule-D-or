package ma.znagui.bouledor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Defie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int receTo;
    private LocalDateTime dateTime;

    @ManyToOne
    private Tournament tournament;

    @OneToMany(mappedBy = "defie")
    private List<Match> matches;

    @ManyToOne
    private Player player1;

    @ManyToOne
    private Player player2;

    @ManyToOne
    private Player winner;
}
