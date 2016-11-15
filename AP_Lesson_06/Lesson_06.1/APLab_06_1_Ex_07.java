import java.util.Scanner;

public class APLab_06_1_Ex_07 
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word.");
		String word = keyboard.nextLine();

		for (int i = word.length(); i > 0; i--) 
		{
			System.out.println(word.substring(0, i));

		}


	}


}


