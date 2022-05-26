package com.elhewazy.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elhewazy.beans.AddressU;

@Repository
public interface AddressRepo extends CrudRepository<AddressU, Integer> {

}
