package com.zhang.kdzs;

import com.zhang.kdzs.system.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceImplTest {

	
	@Autowired
	RoleService roleService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Test
	public void test() {
		
		logger.info(roleService.findUserRole("zjw").toString());
	}

}
