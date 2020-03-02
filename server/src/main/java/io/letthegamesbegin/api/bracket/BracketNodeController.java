package io.letthegamesbegin.api.bracket;

import io.letthegamesbegin.api.repository.BracketNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path="/bracketNode")
public class BracketNodeController {

    @Autowired
    private BracketNodeRepository bracketNodeRepository;

    @PostMapping(path="/add")
    public @ResponseBody String add() {
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<BracketNode> getAll() {
        return bracketNodeRepository.findAll();
    }

    // TODO: implementation
    public void updateBracketNodes(List<BracketNode> bracketNodes) {

    }
    public void updateBracketNode(BracketNode bracketNode) {

    }
}