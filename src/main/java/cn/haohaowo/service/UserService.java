package cn.haohaowo.service;

import java.util.List;

import cn.haohaowo.entity.User;

public interface UserService {

	public void saveUser(User user);
	
	public User loadUserById(Integer id);
	
	public void updateUser(User user);
	
	public List<User> loadAllRoleByUserId(Integer user_id);
	
}
