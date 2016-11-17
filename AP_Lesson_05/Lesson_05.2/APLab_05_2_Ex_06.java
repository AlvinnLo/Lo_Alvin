import java.util.Scanner;

public class APLab_05_2_Ex_06
{
	static Scanner keyboard;
	public static void main(String[]args)
	{	
	    keyboard = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Enter username. (apple)");
		String username = keyboard.next();
		
		System.out.println("Enter password. (orange)");
		String password = keyboard.next();
		
		if (username.equals("apple") && password.equals("orange"))
		{
			System.out.println(" You are granted access!");
		}
		
		if (username.equals("apple") || password.equals("orange"))
		{
			if (!(username.equals("apple")))
			{
				System.out.println("Your username is incorrect!");
				passCheck();
			}
			
			if (!(password.equals("orange")))
			{
				System.out.println("Your password is incorrect!");
				passCheck();
			}

		}
		
		else if (!(username.equals("apple") && password.equals("orange")))
		{
			System.out.println("Your username and password are incorrect!");
			passCheck();
		}			
			
		
	}
	
}