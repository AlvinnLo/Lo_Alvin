import java.util.Scanner;
public class APLab_09_1_Ex_07 
{
	static String[] words;
	public static void main(String[]args) 
	{
		words = new String[5];
		fillArray();
		System.out.print("For the words ");
		printArray();
		System.out.println("Only " + hasZs() + "contain(s) the letter z.");
	}
	public static void fillArray() 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for (int i=0; i<5; i++) 
		{
			words[i] = keyboard.next();
		}
	}
	public static void printArray() 
	{
		for (String word : words) 
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
	public static String hasZs() 
	{
		String zs = "";
		for (String word : words) 
		{
			if (word.indexOf("z") >= 0) 
			{
				zs += word + " ";
			}
		}
		return zs;
	}
}