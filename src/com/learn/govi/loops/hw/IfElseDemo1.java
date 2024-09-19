package com.learn.govi.loops.hw;

public class IfElseDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String inputArguments = String.join(",", args);
		 
		 if (inputArguments.contains("--admin") && inputArguments.contains("--guest")) {
	        	System.out.println( "Please, select either 'ADMIN' or 'GUEST' mode for this program");
	        }   
		 else if(inputArguments.contains("--admin")){
	            System.out.println("Hello, Admin!");
	        }
	        else if(inputArguments.contains("--guest")){
	             System.out.println("Hello, Guest!");
	        }
	        
	}

}
