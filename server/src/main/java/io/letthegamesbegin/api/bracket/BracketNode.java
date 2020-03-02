package io.letthegamesbegin.api.bracket;

import javax.persistence.*;

@Entity
public class BracketNode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int depth;
    private int bracketDisplayId;

    @OneToOne
    private Player playerOne;

    @OneToOne
    private Player playerTwo;
    private int playerOneScore;
    private int playerTwoScore;

    private Integer winnerId;

    @OneToOne
    private BracketNode bracketChildOne;

    @OneToOne
    private BracketNode bracketChildTwo;

    @OneToOne
    private BracketNode parentBracket;

    @ManyToOne
    @JoinColumn(name = "tournamentId")
    private Tournament tournament;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public Integer getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public BracketNode getBracketChildOne() {
        return bracketChildOne;
    }

    public void setBracketChildOne(BracketNode bracketChildOne) {
        this.bracketChildOne = bracketChildOne;
    }

    public BracketNode getBracketChildTwo() {
        return bracketChildTwo;
    }

    public void setBracketChildTwo(BracketNode bracketChildTwo) {
        this.bracketChildTwo = bracketChildTwo;
    }

    public BracketNode getParentBracket() {
        return parentBracket;
    }

    public void setParentBracket(BracketNode parentBracket) {
        this.parentBracket = parentBracket;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getBracketDisplayId() {
        return bracketDisplayId;
    }

    public void setBracketDisplayId(int bracketDisplayId) {
        this.bracketDisplayId = bracketDisplayId;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}
