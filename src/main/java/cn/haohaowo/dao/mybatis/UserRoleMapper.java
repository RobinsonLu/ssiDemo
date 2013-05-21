package cn.haohaowo.dao.mybatis;

import java.util.List;

import cn.haohaowo.entity.User;
import cn.haohaowo.entity.UserRole;

public interface UserRoleMapper extends BasicMapper<UserRole> {
	
	public List<User> getAllUserByRoleId(Integer role_id);
	
	public List<UserRole> getAllUseRoleByRoleId(Integer role_id);

}
