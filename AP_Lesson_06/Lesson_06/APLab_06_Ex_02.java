import java.util.Scanner;

public class APLab_06_Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer.");
		int number = keyboard.nextInt();
		
		for(int i=1; i <= number; i++)
		{
			System.out.println(i * number);
		}
		
	}
	
}
