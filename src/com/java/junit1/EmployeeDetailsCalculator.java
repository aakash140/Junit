package com.java.junit1;

import java.util.Calendar;
import java.util.Date;

public class EmployeeDetailsCalculator {
	
	public int getAge(Date dateOfBirth){
		Calendar dob = Calendar.getInstance();  
		dob.setTime(dateOfBirth);  
		Calendar today = Calendar.getInstance();  
		int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);  
		if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
		  age--;  
		} else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
		    && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
		  age--;  
		}
		return age;
	}
	
	public double getLiableTax(double salary){
		if(salary>250000.0)
			return salary*10.5/100;
		else
			return 0.0;
	}
}