package com.greatlearning.main;

public class Driver {
	
	public static void main(String[] args) {
		
		Admin_department Admin = new Admin_department();
		Hr_department Hr = new Hr_department();
		Tech_department Tech = new Tech_department();
		System.out.println("Welcome to "+Admin.departmentName());
		System.out.println(Admin.getTodaysWork());
		System.out.println(Admin.getWorkDeadline());
		System.out.println(Admin.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to "+Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		System.out.println("\n");
		System.out.println("Welcome to "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
	}

}
