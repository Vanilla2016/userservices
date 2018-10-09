package com.dom.user.userservices.dao;

import com.dom.user.userservices.dto.User;

public interface UserDao {

	void create(User u);
	User read(int id);
}
