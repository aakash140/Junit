package com.java.junit;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class TestCases {

	String input="Hello World";
	Message msg=new Message(input);
	
	@Test
	public void anotherTestMethod(){
		input="Hello World";
		assertEquals(input, msg.getMessage());
	}
	
	@Test
	public void testMethod(){
		input="HW";
		assertFalse(input.equals(msg.getMessage()));
	}
	
	
}