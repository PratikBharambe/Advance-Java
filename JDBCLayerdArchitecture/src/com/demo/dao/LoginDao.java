package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser authenticateUser(String username, String password);

}
