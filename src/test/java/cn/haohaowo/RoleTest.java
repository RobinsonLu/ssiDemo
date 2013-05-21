package cn.haohaowo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.haohaowo.entity.Role;
import cn.haohaowo.service.RoleService;

public class RoleTest {

	private RoleService roleService;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-app.xml");
		roleService= (RoleService)context.getBean("roleService");
	}
	
	@Test
	public void userTest() {
		Role role = new Role();
		role.setName("Programmer");
		roleService.saveRole(role);
		roleService.saveRole(role);
		
		role = roleService.loadRoleById(role.getId());
		role.setName("Program Manager");
		roleService.updateRole(role);
	}
}
