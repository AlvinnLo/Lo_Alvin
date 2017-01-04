import java.util.Scanner;
public class APLab_11_Ex_02
{
	public static void main (String[]args)
	{
			Scanner keyboard = new Scanner(System.in);
		
		String [][] words = new String [4][4];
		
		System.out.println("Please enter a word: ");
		String word = keyboard.next();
		
		int spot = 0;
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				words [i][j] = word.substring(spot, spot +1);
				spot++;
			}
		}
		
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words[i].length; j++)
			{
				System.out.print(words[i][j] + "\t");
			}
			System.out.println();
		}
	}
}