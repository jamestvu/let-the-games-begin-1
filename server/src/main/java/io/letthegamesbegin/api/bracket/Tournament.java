package io.letthegamesbegin.api.bracket;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private TournamentType type;
    private String name;
    private String description;
    private boolean randomSeeding;

    @OneToMany
    private List<Player> players;

    @OneToMany
    private List<BracketNode> bracketNodes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TournamentType getType() {
        return type;
    }

    public void setType(TournamentType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<BracketNode> getBracketNodes() {
        return bracketNodes;
    }

    public void setBracketNodes(List<BracketNode> bracketNodes) {
        this.bracketNodes = bracketNodes;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public boolean isRandomSeeding() {
        return randomSeeding;
    }

    public void setRandomSeeding(boolean randomSeeding) {
        this.randomSeeding = randomSeeding;
    }
}
