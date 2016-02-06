package com.java.junit1;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestCases {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass");
	}

	@Before
	public void before(){
		System.out.println("Before");
	}
	
	@After
	public void after(){
		System.out.println("after");
	}

	@Test(timeout=1000,expected=ArithmeticException.class)
	public void testAge()throws Exception{
		System.out.println("testAge()");
		Employee employee1=new Employee();
		employee1.setName("Aakash");
		SimpleDateFormat simpleDate=new SimpleDateFormat("dd/MM/yyyy");
		String dobString="20/11/1991";
		Date dob=simpleDate.parse(dobString);
		employee1.setDateOfBirth(dob);
		EmployeeDetailsCalculator calc=new EmployeeDetailsCalculator();
		assertEquals(23, calc.getAge(employee1.getDateOfBirth()));
		System.out.println(2/0);
	}
	
	@Ignore
	@Test
	public void testLiableTax() throws ParseException{
		System.out.println("testLiableTax()");
		Employee employee2=new Employee();
		employee2.setName("Vikas");
		employee2.setSalary(250001);
		EmployeeDetailsCalculator calc=new EmployeeDetailsCalculator();
		assertEquals(0.0,calc.getLiableTax(employee2.getSalary()),0.0);
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
}