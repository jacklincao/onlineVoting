package com.lincao.ssm.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lincao.ssm.dao.user.UserDao;
import com.lincao.ssm.entity.user.User;
import com.lincao.ssm.service.user.UserService;

@Service
public class UserServiceBean implements UserService{

	@Resource
	UserDao userDao;
	
	@Override
	public int insertUser(User user) {
		return this.userDao.insertUser(user);
	}

	@Override
	public int deleteUser(Long id) {
		return this.userDao.deleteUser(id);
	}

	@Override
	public int updateUser(User user) {
		return this.userDao.updateUser(user);
	}

	@Override
	public User findUserById(Long id) {
		return this.userDao.findUserById(id);
	}

	@Override
	public List<User> findUsers() {
		return this.userDao.findUsers();
	}

}
