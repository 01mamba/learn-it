package com.learn.govi.enumerations;

public class EnumDemo {
	public static void main(String[] args) {
		Priority priority = Priority.HIGH;
		
		switch (priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
	}
	
	System.out.println("============ Enum valueOf()");
	Priority priority2 = Priority.valueOf("HIGH");
	System.out.println(priority2);
	//priority2 = Priority.valueOf("high"); // java.lang.IllegalArgumentException: No enum constant com.itbulls.learnit.javacore.enumerations.Priority.high
	
	System.out.println("Priority.HIGH == Priority.MEDIUM: " 
			+ (priority == Priority.MEDIUM));	// false

		System.out.println("Priority.HIGH == Priority.HIGH: " 
			+ (priority == Priority.HIGH));	// true
	
		System.out.println("Priority.HIGH.ordinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.MEDIUM.ordinal());
		System.out.println("Priority.MEDIUM.ordinal(): " + Priority.LOW.ordinal());
		
		Priority[] values = Priority.values();
		for(Priority priorty3:values) {
			System.out.println(priorty3);
		}
		System.out.println("JAN days amount "+ Month.JANUARY.getDaysAmount());
	}
}
