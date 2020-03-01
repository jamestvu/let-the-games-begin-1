package io.letthegamesbegin.api.repository;

import org.springframework.data.repository.CrudRepository;

import io.letthegamesbegin.api.entity.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}