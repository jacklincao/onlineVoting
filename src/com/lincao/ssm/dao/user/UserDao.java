package com.lincao.ssm.dao.user;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lincao.ssm.entity.user.User;

@Repository
public interface UserDao {
	public int insertUser(User user);
	
	public int deleteUser(@Param("id")Long id);
	
	public int updateUser(User user);
	
	public User findUserById(Long id);
	
	public List<User> findUsers();
}
