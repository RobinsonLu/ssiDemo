package cn.haohaowo.service;

import cn.haohaowo.entity.Role;

public interface RoleService {

	public void saveRole(Role role);
	
	public Role loadRoleById(Integer id);
	
	public void updateRole(Role role);
}
