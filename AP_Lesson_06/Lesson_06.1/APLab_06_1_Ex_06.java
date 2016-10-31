import java.util.Scanner;

public class APLab_06_1_Ex_06
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word.");
		String word = keyboard.nextLine();
		
		int j = word.length() - 1;
		
		for(int i = 0; i <= j; i++)
		{
			System.out.println(word.substring(i));
		}
		
	}
	
}
