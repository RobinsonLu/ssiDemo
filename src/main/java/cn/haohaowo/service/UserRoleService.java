package cn.haohaowo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import cn.haohaowo.entity.User;
import cn.haohaowo.entity.UserRole;

public interface UserRoleService {

	public void saveUserRole(UserRole userRole);
	
	public UserRole loadUserRoleById(Integer id);
	
	public void updateUserRole(UserRole userRole);
	
	@Transactional(readOnly = true)
	public List<User> loadAllUserByRoleId(Integer role_id);
	
	public List<UserRole> loadAllUseRoleByRoleId(Integer role_id);
}
