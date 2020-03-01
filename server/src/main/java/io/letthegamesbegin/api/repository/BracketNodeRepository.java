package io.letthegamesbegin.api.repository;

import io.letthegamesbegin.api.bracket.BracketNode;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete

public interface BracketNodeRepository extends CrudRepository<BracketNode, Integer> {

}