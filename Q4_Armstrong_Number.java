package day6_Assignment_24_Mar_21;

public class Q4_Armstrong_Number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Q4_Armstrong_Number obj=new Q4_Armstrong_Number();
		
		System.out.println(obj.armStrong(137));
		}
	
	
	

	int sum,mod,temp;
	
	boolean armStrong(int a)
	{
		temp=a;
		while(a>0)
		{
			mod=a%10;
			sum=sum+(mod*mod*mod);
			a=a/10;
			}
		return sum==temp;
		}

	
	
	}

