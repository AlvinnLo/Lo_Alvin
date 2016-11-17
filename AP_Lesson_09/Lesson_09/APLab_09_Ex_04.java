import java.util.Scanner;

public class APLab_09_Ex_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your starting number: ");
		int start = keyboard.nextInt();
		
		System.out.println("Please enter your sequence size: ");
		int size = keyboard.nextInt();
		
		int[] seq = new int[size];
			
			for (int i = 0; i < size; i++)
		{
			if ( i == 0 || i == 1)
			{
				seq[i] = start;
			}
			
			else
			{
				seq[i] = seq[i-1] + seq [i-2];
			}
			
			System.out.print( seq[i] + " " );	
		}	
	}
}