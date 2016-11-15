import java.util.Scanner;

public class APLab_09_Ex_02
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
				
		first(names);
	}
	
	public static void first(String[]names)
	{
		for (String name : names) 
		{         
			System.out.print(name.charAt(0)); 
		}
	}
}

