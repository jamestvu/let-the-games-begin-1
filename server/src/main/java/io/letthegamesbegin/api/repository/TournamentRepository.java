package io.letthegamesbegin.api.repository;

import io.letthegamesbegin.api.bracket.Tournament;
import org.springframework.data.repository.CrudRepository;

public interface TournamentRepository extends CrudRepository<Tournament, Integer> {

}