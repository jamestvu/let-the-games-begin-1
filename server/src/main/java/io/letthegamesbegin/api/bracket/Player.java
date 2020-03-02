package io.letthegamesbegin.api.bracket;

import javax.persistence.*;

@Entity
public class Player implements Comparable<Player> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Integer userId;
    private int seed;

    @ManyToOne
    @JoinColumn(name = "tournamentId")
    private Tournament tournament;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public int compareTo(Player p) {
        return seed - p.getSeed();
    }
}
