import java.util.Scanner;

public class APLab_06_Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word.");
		String word = keyboard.nextLine();
		
		

		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(word);
		}
		
	}
	
}
