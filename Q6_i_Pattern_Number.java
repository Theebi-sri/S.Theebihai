package day6_Assignment_24_Mar_21;

import java.util.Scanner;

public class Q6_i_Pattern_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,num;
		num = 5;
//		System.out.print("Input number of rows : ");
//		Scanner in = new Scanner(System.in);
//		num = in.nextInt();
		    
		    for(i=1;i<=num;i++)
		    {
		    	for(j=1;j<=i;j++)
		    		System.out.print(j);
		    	
		    	System.out.println("");
		    }
		    
		    for (i=num-1; i>=0; i--)
			{
				for(j=1; j <= i-1;j++)
					{
						System.out.print(j);
					}
					System.out.println("");
			}
	}
}