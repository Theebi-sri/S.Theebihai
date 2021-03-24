package day6_Assignment_24_Mar_21;

import java.util.Scanner;

public class Q5_Reverse_Name {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Name: ");	
		
		String name;
		name=s.nextLine();
		System.out.print("Reverse the Name is: ");
		
		for(int x=name.length();  x>0;  x--) 
		{
			System.out.print(name.charAt(x-1));
		}
		
	}
}