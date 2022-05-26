package com.elhewazy.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elhewazy.beans.Users;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {

}
