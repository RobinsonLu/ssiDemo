package cn.haohaowo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.haohaowo.dao.mybatis.UserMapper;
import cn.haohaowo.entity.User;

@Service(value = "userService")
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public void saveUser(User user) {
		userMapper.insert(user);
	}

	public User loadUserById(Integer id) {
		return userMapper.get(id);
	}

	public void updateUser(User user) {
		userMapper.updateById(user);
	}

	@Override
	public List<User> loadAllRoleByUserId(Integer user_id) {
		return userMapper.loadAllRoleByUserId(user_id);
	}

}
