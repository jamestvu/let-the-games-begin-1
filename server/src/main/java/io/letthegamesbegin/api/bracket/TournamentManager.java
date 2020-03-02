package io.letthegamesbegin.api.bracket;

import io.letthegamesbegin.api.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ansi.Ansi8BitColor;

import java.util.Collections;
import java.util.List;

public class TournamentManager {

    @Autowired
    private TournamentRepository tournamentRepository;


    public Tournament createTournament(Tournament tournament) {
        switch (tournament.getType()) {
            case SINGLE: return createSingleEliminationTournament(tournament);
            case DOUBLE: return createDoubleEliminationTournament(tournament);
            case ROUND_ROBIN: return createRoundRobinTournament(tournament);
            default: throw new RuntimeException("Invalid Tournament Type");
        }
    }

    // TODO: implemententation
    private Tournament createDoubleEliminationTournament(Tournament tournament) {

        tournamentRepository.save(tournament);
        return null;
    }

    // TOOD: figure out this algorithm for seeding
    private Tournament createSingleEliminationTournament(Tournament tournament) {

        List<Player> players = tournament.getPlayers();
        if (tournament.isRandomSeeding()) {
            Collections.shuffle(players);
        }
        else {
            Collections.sort(players);
        }

        boolean isPowerOfTwo = isPowerOfTwo(players.size());

        if (isPowerOfTwo) {
            for (int i = 0; i < players.size() / 2; i++) {

            }
        }
        else {
            for (Player player: players) {

            }
        }



        tournamentRepository.save(tournament);
        return null;

    }

    private Tournament createRoundRobinTournament(Tournament tournament) {

        tournamentRepository.save(tournament);
        return null;
    }

    private boolean isPowerOfTwo(int number){
        if (number <= 0){
            return false;
        }

        while (number > 1) {
            if (number % 2 != 0) {
                return false;
            }
            number = number / 2;
        }
        return true;
    }
}
