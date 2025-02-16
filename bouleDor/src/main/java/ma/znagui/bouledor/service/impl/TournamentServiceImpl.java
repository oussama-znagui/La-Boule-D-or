package ma.znagui.bouledor.service.impl;

import lombok.AllArgsConstructor;
import ma.znagui.bouledor.entity.Tournament;
import ma.znagui.bouledor.exception.ResourceNotFoundExeption;
import ma.znagui.bouledor.repository.TournamentRepository;
import ma.znagui.bouledor.service.TournamentService;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TournamentServiceImpl implements TournamentService {
    private final TournamentRepository tournamentRepository;

    @Override
    public Tournament getTournamentEntityById(Long id) {

        return tournamentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExeption("Tournament",id));
    }
}
