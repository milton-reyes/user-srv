package com.yukaju.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.yukaju.UserSrvApplication;

@SpringBootTest
public class UserSrvApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	
	@Test
    public void test()
    {
		UserSrvApplication.main(new String[]{
                "--spring.main.web-environment=false"         
        });
    }

}
