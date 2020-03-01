package io.letthegamesbegin.api.bracket;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BracketNode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Player playerOne;
    private Player playerTwo;
    private int playerOneScore;
    private int playerTwoScore;
    private Integer winnerId;
    private BracketNode bracketChildOne;
    private BracketNode bracketChildTwo;
    private BracketNode parentBracket;
    private int tournamentId;

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

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
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
}
