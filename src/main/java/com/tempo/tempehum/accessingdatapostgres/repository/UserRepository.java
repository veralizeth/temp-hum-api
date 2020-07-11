package com.tempo.tempehum.accessingdatapostgres.repository;

import org.springframework.data.repository.CrudRepository;
import com.tempo.tempehum.accessingdatapostgres.model.UserAdm;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserAdm, Integer> {

}