package io.letthegamesbegin.api.bracket;

import io.letthegamesbegin.api.repository.PlayerRepository;
import io.letthegamesbegin.api.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/bracketNode")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping(path="/add")
    public @ResponseBody String add() {
        return "Saved";
    }

}