import java.util.Scanner;

public class APLab_09_Ex_01
{
	public static void main(String[]args)
	{
		String [] names = new String[5];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 5 words");
		
		for (int i = 0; i < names.length; i++)
		{
			names[i] = keyboard.next();
		}
		
		System.out.println("In order... ");
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		System.out.println(" ");

		System.out.println("Reversed... ");
		
		reverse(names);
	}
	
	public static void reverse(String[]n)
	{
		for (int i = n.length - 1; i >= 0; i--)
		{
			System.out.println(n[i]);
		}
	}
}

