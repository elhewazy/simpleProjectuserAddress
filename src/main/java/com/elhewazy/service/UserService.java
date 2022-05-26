package com.elhewazy.service;

import com.elhewazy.beans.Users;

public interface UserService {

	public Users addUser(Users user);

	public Users getUser(int id);

	public Users updateUser(Users user);

	public String deletUser(int id);

}
