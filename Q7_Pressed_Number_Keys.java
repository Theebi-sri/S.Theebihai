package day6_Assignment_24_Mar_21;

import java.io.IOException;

public class Q7_Pressed_Number_Keys {
	public static void main(String[] args)
	{
		pressedKey();
	}
	static void pressedKey(){
		char Scan=' ';
		System.out.print("Press a number key:");
		
		try {
			Scan = (char)System.in.read();
			} catch (IOException s) {
				// TODO Auto-generated catch block
				s.printStackTrace();
			}
		switch (Scan)
		{
		case '0':
			System.out.println("Pressed 0");
			break;
			
		case '1':
			System.out.println("Pressed 1");
			break;
		
		case '2':
			System.out.println("Pressed 2");
			break;
		
		case '3':
			System.out.println("Pressed 3");
			break;
		
		case '4':
			System.out.println("Pressed 4");
			break;
		
		case '5':
			System.out.println("Pressed 5");
			break;
			
		default: System.out.println("Not allowed!");
			break;
			}
		}
}