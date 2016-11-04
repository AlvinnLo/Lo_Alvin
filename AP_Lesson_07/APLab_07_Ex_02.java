import java.util.Scanner;

public class APLab_07_Ex_02
{
	
	static int number;
	static int digits = 0;
	static int average = 0;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		number = keyboard.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number +  " is "  + average);
	}
	
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += (num % 10);
			num /=10;
			average = average / digits;
		}
		
	}	
}
