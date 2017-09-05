package com.lincao.ssm.service.user;

import java.util.List;
import com.lincao.ssm.entity.user.User;

public interface UserService {
	public int insertUser(User user);
	
	public int deleteUser(Long id);
	
	public int updateUser(User user);
	
	public User findUserById(Long id);
	
	public List<User> findUsers();
}
