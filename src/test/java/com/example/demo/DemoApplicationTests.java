package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("chenggong");
	}
	@Autowired
	UserDao userDao;
	@Test
	void add(){
		List<User> list=new ArrayList<User>();
		list.add(new User("tom","boy",19));
		list.add(new User("jean","girl",23));
		list.add(new User("joy","boy",22));
		list.add(new User("jone","boy",28));
		list.add(new User("maryy","girl",32));
		list.add(new User("tony","boy",42));
		userDao.saveAll(list);








	}

}
