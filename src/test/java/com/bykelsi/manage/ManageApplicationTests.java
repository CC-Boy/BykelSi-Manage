package com.bykelsi.manage;

import com.bykelsi.repository.BookEOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	BookEOMapper bookEOMapper ;
	@Test
	public void contextLoads()  throws  Exception{

		bookEOMapper.getBookEOPages();
	}

}
