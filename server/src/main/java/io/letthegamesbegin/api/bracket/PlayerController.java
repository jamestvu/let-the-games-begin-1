package io.letthegamesbegin.api.bracket;

import io.letthegamesbegin.api.repository.PlayerRepository;
import io.letthegamesbegin.api.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/bracketNode")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    // TODO: implement
    @PostMapping(path="/add")
    public @ResponseBody String add(@RequestBody Player player) {
        playerRepository.save(player);
        return "Saved";
    }

}