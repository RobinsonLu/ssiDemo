package cn.haohaowo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.haohaowo.dao.mybatis.UserRoleMapper;
import cn.haohaowo.entity.User;
import cn.haohaowo.entity.UserRole;

@Service(value = "userRoleService")
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	public void saveUserRole(UserRole userRole) {
		userRoleMapper.insert(userRole);
	}

	public UserRole loadUserRoleById(Integer id) {
		return userRoleMapper.get(id);
	}

	public void updateUserRole(UserRole userRole) {
		userRoleMapper.updateById(userRole);
	}

	public List<User> loadAllUserByRoleId(Integer role_id) {
		return userRoleMapper.getAllUserByRoleId(role_id);
	}

	public List<UserRole> loadAllUseRoleByRoleId(Integer role_id) {
		return userRoleMapper.getAllUseRoleByRoleId(role_id);
	}

}
