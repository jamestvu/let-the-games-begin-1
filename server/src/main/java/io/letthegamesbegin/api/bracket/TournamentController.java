package io.letthegamesbegin.api.bracket;

import io.letthegamesbegin.api.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/tournament")
public class TournamentController {

    @Autowired
    private TournamentRepository tournamentRepository;

    @PostMapping(path="/add")
    public @ResponseBody String add(@RequestBody Tournament tournament) {

        tournamentRepository.save(tournament);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    // TODO
    public Tournament getTournamentById(int id) {
        return null;
    }
}