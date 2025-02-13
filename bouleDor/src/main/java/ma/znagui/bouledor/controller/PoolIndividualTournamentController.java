package ma.znagui.bouledor.controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentRequestDTO;
import ma.znagui.bouledor.dto.poolIndividualTournament.PoolIndividualTournamentResponseDTO;
import ma.znagui.bouledor.service.PoolIndividualTournamentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/pool-individual-tournament")
public class PoolIndividualTournamentController {
    private final PoolIndividualTournamentService service;

    @PostMapping
    public ResponseEntity<PoolIndividualTournamentResponseDTO> createPoolIndividualTournament(@Valid @RequestBody PoolIndividualTournamentRequestDTO dto){
     return    ResponseEntity.ok(service.createIndividualTournament(dto));
    }
}
