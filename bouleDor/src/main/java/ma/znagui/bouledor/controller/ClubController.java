package ma.znagui.bouledor.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.club.ClubCreateDTO;
import ma.znagui.bouledor.dto.club.ClubResponseDTO;
import ma.znagui.bouledor.service.ClubService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Clubs")
@AllArgsConstructor
public class ClubController {

    private final ClubService clubService;

    @PostMapping("/a")
    public ResponseEntity<ClubResponseDTO> createClub(@Valid @RequestBody ClubCreateDTO dto){
        return ResponseEntity.ok(clubService.createClub(dto));
    }

    @GetMapping
    public ResponseEntity<String> hey(){
        return ResponseEntity.ok("allo");
    }


}
