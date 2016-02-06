package com.java.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Tester {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestCases.class);
		for(Failure failure:result.getFailures())
			System.out.println(failure.getMessage());
		System.out.println(result.wasSuccessful());
	}
}