package com.java.junit1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Tester {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestCases.class);
		for(Failure failure:result.getFailures())
			failure.getMessage();
		System.out.println(result.wasSuccessful());
	}
}