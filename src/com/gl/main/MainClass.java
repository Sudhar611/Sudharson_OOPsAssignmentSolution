package com.gl.main;

import com.gl.departments.*;

public class MainClass {

	public static void main(String[] args) {
		
		AdminDepartment adminObj = new AdminDepartment();
		HrDepartment hrObj = new HrDepartment();
		TechDepartment techObj = new TechDepartment();
		
		System.out.println( "Welcome to " +
					adminObj.departmentName() + "\n" +
					adminObj.getTodaysWork() + "\n" +
					adminObj.getWorkDeadline() + "\n" +
					adminObj.isTodayAHoliday() + "\n"
				);
		
		System.out.println("Welcome to " +
				hrObj.departmentName() + "\n" +
				hrObj.doActivity() + "\n" +
				hrObj.getTodaysWork() + "\n" +
				hrObj.getWorkDeadline() + "\n" +
				hrObj.isTodayAHoliday() + "\n"
			);	
		
		System.out.println("Welcome to " +
				techObj.departmentName() + "\n" +
				techObj.getTodaysWork() + "\n" +
				techObj.getWorkDeadline() + "\n" +
				techObj.getTechStackInformation() + "\n" +
				techObj.isTodayAHoliday() + "\n"
			);
		
	}

}
