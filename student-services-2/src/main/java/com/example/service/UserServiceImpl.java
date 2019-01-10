package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.model.User;


@Service("userService")
public class UserServiceImpl implements UserService   {
	
    @Autowired
	UserDAO userDao;

	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
	
	public User findById(long id) {
		return userDao.findById(id);
	}
	
	public User findByName(String name) {
		return userDao.findByName(name);
	}
	
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	public void deleteUserById(long id) {
		userDao.deleteUserById(id);
	}

	public void deleteAllUsers(){
		userDao.deleteAllUsers();
	}

	public boolean isUserExist(User user) {
		return findByName(user.getName())!=null;
	}

}
