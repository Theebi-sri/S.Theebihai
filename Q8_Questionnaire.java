package day6_Assignment_24_Mar_21;

import java.util.Scanner;

public class Q8_Questionnaire {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean out = false;
		String run = "";
		
		do {
			System.out.println("\"Questionnaire\" : 01");
			System.out.println("What is the command keyword to exit a loop in java ?");
			System.out.println("A:int\nB:continue\nC:break\nD:exit");
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice ");
			String answer=sc.nextLine();
			
			
			
			switch(answer) {
			case "a":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			case "b":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			case "c":
				System.out.println("Correct!");
				out=true;
				break;
				
			case "d":
				System.out.println("Incorrect!");
				out=false;
				break;
				
			default :
				System.out.println("Incorrect your choice!");
				out=false;
				break;
			}
			if(!out) {
				System.out.println("Again? press y to continue.");
				run=sc.nextLine();
			}
		} while (run.equalsIgnoreCase("y"));		
	}
}
