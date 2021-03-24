package day6_Assignment_24_Mar_21;

import java.util.Scanner;

public class Q6_ii_Pattern_Star {
	public static void main(String[] args)
	{
		int i, j, star;
		//Scanner s = new Scanner(System.in);
		//System.out.print("Enter the number of rows you want to print: ");		
		//star = s.nextInt();
		
		star= 7;
			
		for (i= 0; i<= star-2; i=i+2)
		{
			for (j=0; j<=i; j++)
				{
					System.out.print("*"+ " ");
				}
				System.out.println("");
		}
	
	
				
		for (i=star; i>=0; i=i-2)
		{
			for(j=0; j <= i-1;j++)
				{
					System.out.print("*"+ " ");
				}
				System.out.println("");
		}
	}  
}  