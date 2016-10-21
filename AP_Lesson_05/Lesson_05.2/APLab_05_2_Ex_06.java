import java.util.Scanner;

public class APLab_05_2_Ex_06
{
	public static void main(String[]args)
	{	
		String username = "apple";
		String password = "orange";
		
		passCheck(username, password);
		
		
	}
	
	public static void passCheck(String username, String password)
	{
		if (username.equals("apple") && password.equals("orange"))
		{
			System.out.println(" You are granted access!");
		}
		
		if (username.equals("apple") || password.equals("orange"))
		{
			if (!(username.equals("apple")))
			{
				System.out.println("Your username is incorrect!");
			}
			
			if (!(password.equals("orange")))
			{
				System.out.println("Your password is incorrect!");
			}

		}
		
		else if (!(username.equals("apple") && password.equals("orange")))
		{
			System.out.println("Your username and password are incorrect!");
		}			
			
		
	}
	
}