package day6_Assignment_24_Mar_21;

//import java.util.Scanner;

public class Q6_iii_Pattern_Nu_ST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
//		System.out.print("Input number of rows : ");
//		Scanner in = new Scanner(System.in);
//		num = in.nextInt();

		
		
		for(int i=1; i<=7; i++)
		{
			for(num=1; num<=i; num++)
			{
				System.out.print(num);
			}
			
			
			while(num<=7)
			{
				System.out.print("*");
				num++;
			}
			System.out.println("");
			}
	}
}
	
	
	
	
	
	
	
	