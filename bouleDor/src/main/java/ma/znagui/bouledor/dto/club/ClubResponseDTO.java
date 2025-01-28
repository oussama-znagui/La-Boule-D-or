package ma.znagui.bouledor.dto.club;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter

public class ClubResponseDTO {
    private Long id;
    private String name;
    private String adresse;
    private LocalDate fondationDate;
    private int capacity;
}
