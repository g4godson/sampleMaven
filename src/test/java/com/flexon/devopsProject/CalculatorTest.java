package com.flexon.devopsProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void testSum() {

        System.out.println("sum");

        Integer x = 15;

        Integer y = 15;

        Integer expResult = 30;

        Integer result = Calculator.sum(x, y);

        assertEquals(expResult, result);

        assertEquals(null, Calculator.sum(15, null));

        assertEquals(null, Calculator.sum(null, 15));

        assertEquals(null, Calculator.sum(null, null));

    }
	
	@Test
	public void testSubtract() {

        System.out.println("subtract");

        Integer x = 17;

        Integer y = 15;

        Integer expResult = 2;

        Integer result = Calculator.sub(x, y);

        assertEquals(expResult, result);

        assertEquals(null, Calculator.sub(15, null));

        assertEquals(null, Calculator.sub(null, 15));

        assertEquals(null, Calculator.sub(null, null));

    }
	
	@Test
	public void testMultiplication() {
		Integer x = 5;
		Integer y = 3;
		Integer expResult = 15;
		Integer result = Calculator.mult(x,y);
		
		assertEquals(expResult, result);
		assertEquals(null, Calculator.mult(15,  null));
		assertEquals(null, Calculator.mult(null, 15));
		assertEquals(null, Calculator.mult(null, null));
		
	}

}
