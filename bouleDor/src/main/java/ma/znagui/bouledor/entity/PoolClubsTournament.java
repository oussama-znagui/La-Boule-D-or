package ma.znagui.bouledor.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public abstract class  PoolClubsTournament extends Tournament {
    protected int NumberOfTeams;

}
