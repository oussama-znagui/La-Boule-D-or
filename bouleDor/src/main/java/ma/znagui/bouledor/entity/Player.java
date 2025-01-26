package ma.znagui.bouledor.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ma.znagui.bouledor.enums.GameType;
import ma.znagui.bouledor.enums.Level;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@DiscriminatorValue("PLAYER")
public class Player extends AppUser {
    private GameType gameType;
    private Level level;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = true)
    private Club club;

}
