package com.maven.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	Calculator cal = null;
	
	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumPositive() {
		int[] input = {1,2,3,4};
		Assert.assertEquals(10, cal.sum(input));
	}
	
	@Test
	public void testSumNegative() {
		int[] input = {1,2,3,4};
		Assert.assertEquals(11, cal.sum(input));
	}

}
