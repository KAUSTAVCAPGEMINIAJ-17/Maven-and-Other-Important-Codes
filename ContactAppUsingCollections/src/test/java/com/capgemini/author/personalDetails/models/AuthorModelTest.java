package com.capgemini.author.personalDetails.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthorModelTest {

	static AuthorModel a;
	static AuthorModel a1;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		a = new AuthorModel("JK ROWLING", "jkrowling6555@gmail.com", 'f');
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		a = null;
	}
	
	@BeforeEach
	void setup() throws Exception {
		a1 = new AuthorModel();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		a1 = null;
	}

	@Test
	void testAuthor() {
		assertEquals(new AuthorModel(), a1);
	}
	
	@Test
	void testGetName() {
		assertEquals("JK ROWLING", a.getName());
	}
	@Test
	void testGetEmail() {
		assertEquals("jkrowling6555@gmail.com", a.getEmail());
	}
	@Test
	void testGetGender() {
		assertEquals('f', a.getGender());
	}
	
}