package cn.haohaowo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.haohaowo.entity.UserRole;
import cn.haohaowo.service.UserRoleService;

public class UserRoleTest {

	private UserRoleService userRoleService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-app.xml");
		userRoleService= (UserRoleService)context.getBean("userRoleService");
	}
	
//	@Test
	public void userTest() {
//		UserRole userRole = new UserRole();
//		userRole.setUser_id(1);
//		userRole.setRole_id(1);
//		userRoleService.saveUserRole(userRole);
//		
//		userRole.setUser_id(2);
//		userRole.setRole_id(4);
//		userRoleService.saveUserRole(userRole);
//		
//		userRole.setUser_id(3);
//		userRole.setRole_id(2);
//		userRoleService.saveUserRole(userRole);
//		
//		userRole.setUser_id(4);
//		userRole.setRole_id(3);
//		userRoleService.saveUserRole(userRole);
//		
//		userRole.setUser_id(5);
//		userRole.setRole_id(1);
//		userRoleService.saveUserRole(userRole);
	}
	
	@Test
	public void userRoleTest() {
//		List<User> userList = userRoleService.loadAllUserByRoleId(1);
//		assertEquals(userList.get(0).getName(), "Shark");
		
		List<UserRole> userRoleList = userRoleService.loadAllUseRoleByRoleId(1);
		assertEquals(userRoleList.get(0).getUser().getName(), "Shark");
	}
}
