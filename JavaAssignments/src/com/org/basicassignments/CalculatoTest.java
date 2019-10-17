package com.org.basicassignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatoTest {
  Calculator cal;
	@BeforeEach
	void setUp() throws Exception {
		cal=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		cal=null;
	}

	@Test
	void testAdd() {
		assertEquals(10, cal.add(5,5));
	}

	@Test
	void testSub() {
		assertEquals(0,cal.sub(5,5));
	}

	@Test
	void testMul() {
		assertEquals(25,cal.mul(5, 5));
	}

	@Test
	void testDiv() {
		assertEquals(1, cal.div(5,5));
	}

}
