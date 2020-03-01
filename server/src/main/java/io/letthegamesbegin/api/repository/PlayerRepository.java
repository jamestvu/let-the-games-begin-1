package io.letthegamesbegin.api.repository;

import io.letthegamesbegin.api.bracket.Player;
import io.letthegamesbegin.api.entity.User;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete

public interface PlayerRepository extends CrudRepository<Player, Integer> {

}