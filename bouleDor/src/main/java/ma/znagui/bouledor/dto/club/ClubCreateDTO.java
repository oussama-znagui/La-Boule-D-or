package ma.znagui.bouledor.dto.club;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class ClubCreateDTO {
    @NotBlank(message = "Le nom du club SVP!")
    private String name;
    @NotBlank(message = "Le nom du club SVP!")
    private String adresse;
    @NotBlank(message = "Le nom du club SVP!")
    private LocalDate fondationDate;
    @NotBlank(message = "Le nom du club SVP!")
    private int capacity;

}
