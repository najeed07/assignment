package com.oopsProject.najeed;

public class Main {

	public static void main(String[] args) {
	
		AdminDepartment ad = new AdminDepartment();

		System.out.println("Welcome to " + " "+ ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + " "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		TechDepartment tc = new TechDepartment();
		System.out.println("Welcome to " + " "+ tc.departmentName());
		System.out.println(tc.getTodaysWork());
		System.out.println(tc.getWorkDeadline());
		System.out.println(tc.getTechStackInformation());
		System.out.println(tc.isTodayAHoliday());
}
}
