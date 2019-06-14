package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.User;

public interface UserServiceInterface {
	public User saveUser(User User);
	public Boolean deleteUser(Long UserId);
	public User editUser(User User);
	public User findUser(Long UserId);
	public Collection<User> getAllUsers();
	public User findUserByLoginAndPassword(String login, String password);

}
