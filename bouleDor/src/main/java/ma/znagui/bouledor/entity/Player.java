package ma.znagui.bouledor.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;
import ma.znagui.bouledor.enums.GameType;
import ma.znagui.bouledor.enums.Level;




@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("PLAYER")
@Entity
public class Player extends AppUser {
    private GameType gameType;
    private Level level;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = true)
    private Club club;

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }
}
