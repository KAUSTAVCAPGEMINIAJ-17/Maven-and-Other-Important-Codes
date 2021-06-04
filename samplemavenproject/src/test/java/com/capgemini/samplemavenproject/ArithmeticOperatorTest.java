package com.capgemini.samplemavenproject;


	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.jupiter.api.Test;

	public class ArithmeticOperatorTest {
		ArithmeticOperator aop=new ArithmeticOperator();
		
		@Test
		public void addTest() {
			int expectedResult=11;
			int actualResult=aop.add(5, 6);
			assertEquals(expectedResult,actualResult);
		}
		
		@Test
		public void subTest() {
			int expectedResult=11;
			int actualResult=aop.sub(15, 4);
			assertEquals(expectedResult,actualResult);
		}
		@Test
		public void multTest() {
			int expectedResult=15;
			int actualResult=aop.mult(5, 3);
			assertEquals(expectedResult,actualResult);
		}
		@Test
		public void divTest() {
			int expectedResult=8;
			int actualResult=aop.div(32, 4);
			assertEquals(expectedResult,actualResult);
		}
		

	}
