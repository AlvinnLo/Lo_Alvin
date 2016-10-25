import java.util.Scanner;

public class APLab_06_1_Ex_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the starting number of the loop. (Smaller one)");
		int min = keyboard.nextInt();
		
		System.out.println("Enter the ending number of the loop. (Larger one)");
		int max = keyboard.nextInt();
		
		for(int i=min; i <= max; i+= min)
		{
			System.out.print(i + " ");
		}
		
	}
	
}
