package cn.haohaowo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.haohaowo.dao.mybatis.RoleMapper;
import cn.haohaowo.entity.Role;

@Service(value = "roleService")
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleMapper roleMapper;

	public void saveRole(Role role) {
		roleMapper.insert(role);
	}

	public Role loadRoleById(Integer id) {
		return roleMapper.get(id);
	}

	public void updateRole(Role role) {
		roleMapper.updateById(role);
	}

}
