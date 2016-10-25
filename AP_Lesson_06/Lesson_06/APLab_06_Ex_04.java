import java.util.Scanner;

public class APLab_06_Ex_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer.");
		int number = keyboard.nextInt();
		
		System.out.println("Enter the size of the table");
		int size = keyboard.nextInt();
		
		for(int i=1; i <= size; i++)
		{
			format(i, number *i);
		}
			
	}
	public static void format(int i, int number)
	{
		
		System.out.println( i + "  |  " + i * number);
	}
}
