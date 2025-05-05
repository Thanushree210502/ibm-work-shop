package com.ibm.exceptionss;

class IllegalAgeException extends Exception{
	
}
class ElectionVoting{
	public void register (int age) throws IllegalAgeException{
		if(age<18) {
			throw new IllegalAgeException();
			
		}
		System.out.println("Registration completed");
	}
}

public class Application{
 
	public static void main( String[] args ){
	System.out.println("statrt");
	ElectionVoting electionvoting = new ElectionVoting();
	try {
		electionVoting.register(17);
	}catch (IllegalAgeException e) {
		//1000 Auto-generated catch block
		e.printStackTrace();
	}
	system.out.println("End");
	}
}
	
	