package cn.haohaowo.dao.mybatis;

import java.util.List;

import cn.haohaowo.entity.User;

public interface UserMapper extends BasicMapper<User>{
	
	public List<User> loadAllRoleByUserId(Integer user_id);

}
