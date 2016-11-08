import java.util.Scanner;

public class APLab_08_Ex_03
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = keyboard.nextInt();
		
		System.out.println(luck(num));
		
	}
	
	public static int luck(int num)
	{
		if(num > 0)
		{
			if(num % 10 == 7)
			{
				return 1 + (luck(num/10));
			}
			else
			{
				return 0 + (luck(num/10));
			}
		}
		
		else
		{
			return 0;
		}
	
	}	
}
