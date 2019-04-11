package com.bykelsi.manage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	private DataSource dataSource ;
	@Test
	public void contextLoads()  throws  Exception{

		Connection conn = dataSource.getConnection();
		System.out.println("11111111111"+conn);
		conn.close();
	}

}
