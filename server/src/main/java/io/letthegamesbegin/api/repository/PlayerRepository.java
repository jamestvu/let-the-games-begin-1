package io.letthegamesbegin.api.repository;

import io.letthegamesbegin.api.bracket.Player;
import io.letthegamesbegin.api.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}