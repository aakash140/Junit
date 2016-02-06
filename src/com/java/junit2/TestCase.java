package com.java.junit2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestCase {
	Calculator calculator;
	int number;
	Boolean expectedResult;

	@Before
	public void init(){
		calculator=new Calculator();
	}

	public TestCase(int number,boolean expectedResult){
		this.number=number;
		this.expectedResult=expectedResult;
	}

	@Parameterized.Parameters
	public static List<Object[]> evenNumbers(){
		return Arrays.asList(new Object[][]{
				{2,true},
				{3,false},
				{4,true},
				{5,false}
		});
	}

	@Test
	public void testEvenNumber(){
		assertEquals(expectedResult,calculator.isEven(number));
	}
}