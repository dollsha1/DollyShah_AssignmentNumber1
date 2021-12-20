package com.greatlearning.main;

class Super_department {
	
	public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
		return "No Work as of now";
	}
	public String getWorkDeadline() {
		return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
}

class Admin_department extends Super_department {
	
	public String departmentName() {
		return "Admin Department ";
	}
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
}

class Hr_department extends Super_department {
	
	public String departmentName() {
		return "Hr Department ";
	}
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String doActivity() {
		return "team Lunch";
	}
}

class Tech_department extends Super_department {
	
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	public String getTechStackInformation() {
		return "core Java";
	}
	
}