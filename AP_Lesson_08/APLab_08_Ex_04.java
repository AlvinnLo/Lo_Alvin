import java.util.Scanner;

public class APLab_08_Ex_04
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = keyboard.next();
		
		int start =  1;
		int stop = word.length();
		
		System.out.println(tree(word, start, stop));
		
	}
	
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0, start));
			start += 1;
			return word;
		}
		else
		{
			return word;
		}
	}	
}
