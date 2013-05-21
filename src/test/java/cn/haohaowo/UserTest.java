package cn.haohaowo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.haohaowo.entity.User;
import cn.haohaowo.service.UserService;

public class UserTest {

	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-app.xml");
		userService= (UserService)context.getBean("userService");
	}
	
//	@Test
	public void userTest() {
		User user = new User();
		user.setName("Robinson");
		user.setPassword("1234567");
		user.setStatus("Y");
		user.setAssociate_id(1);
		userService.saveUser(user);
		
		user = userService.loadUserById(user.getId());
		user.setPassword("123456");
		userService.updateUser(user);
	}
	
	@Test
	public void userCollectionTest() {
		List<User> userList = userService.loadAllRoleByUserId(1);
//		assertEquals("robinson", userList.get(0).getName());
		assertEquals("robinson", userList.get(0).getRoles().get(0).getRole().getName());
	}
}
