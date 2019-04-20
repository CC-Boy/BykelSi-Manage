package com.bykelsi.manage;

import com.bykelsi.entity.BookEO;
import com.bykelsi.repository.BookEOMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManageApplicationTests {

	@Autowired
	BookEOMapper bookEOMapper ;
	@Test
	public void contextLoads()  throws  Exception{

		List<BookEO> books = bookEOMapper.getBookEOAll();
		System.out.println(books.get(0).getBookname());
	}

}
