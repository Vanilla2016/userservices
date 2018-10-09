package com.dom.user.userservices.dao;

import java.util.Map;
import java.util.HashMap;

import com.dom.user.userservices.dto.User;

public class UserDaoImpl implements UserDao {

	private Map<Integer, User> userMap = new HashMap();
	
	public void create(User u) {
		// TODO Auto-generated method stub
		userMap.put(u.getId(), u);
	}

	public User read(int id) {
		return userMap.get(id);
	}

}
