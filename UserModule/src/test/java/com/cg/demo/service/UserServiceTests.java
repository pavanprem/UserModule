package com.cg.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.demo.model.User;

@SpringBootTest
class UserServiceTests {

	@Autowired
	private UserService userservice;
	User user2 = new User("103", "pavan", "analyst");
	User user3 = new User("105", "raadha", "analyst");
	User user4 = new User("104", "krishna", "senioranalyst");

	@Test
	void testChangePassword1() {
		User updatedUser = userservice.changePassword("103", "pavan", "prem");
		assertEquals("prem", updatedUser.getPassword());
	}

	@Test
	void testChangePassword2() {
		User updatedUser = userservice.changePassword("105", "krishna", "raadha");
		assertEquals("raadha", updatedUser.getPassword());
	}

	@Test
	void testChangePassword3() {
		User updatedUser = userservice.changePassword("104", "raadha", "krishna");
		assertEquals("krishna", updatedUser.getPassword());
	}

	@Test
	void testSignIn1() {
		assertTrue(userservice.signIn(user2));
	}

	@Test
	void testSignIn2() {
		assertTrue(userservice.signIn(user3));
	}

	@Test
	void testSignIn3() {
		assertTrue(userservice.signIn(user4));
	}

	@Test
	void testSignOut1() {
		assertTrue(userservice.signOut(user2));
	}

	@Test
	void testSignOut2() {
		assertTrue(userservice.signOut(user3));
	}

	@Test
	void testSignOut3() {
		assertTrue(userservice.signOut(user4));
	}

}