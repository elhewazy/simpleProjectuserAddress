package com.elhewazy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elhewazy.beans.Users;
import com.elhewazy.repo.UserRepo;

@Service
public class UsersServImp implements UserService {

	@Autowired
	UserRepo ur;

	@Override
	public Users addUser(Users user) {

		return ur.save(user);
	}

	@Override
	public Users getUser(int id) {
		// TODO Auto-generated method stub
		return ur.findById(id).get();
	}

	@Override
	public Users updateUser(Users user) {

		return ur.save(user);
	}

	@Override
	public String deletUser(int id) {

		ur.deleteById(id);

		return "deleted user is: " + id;
	}

}
