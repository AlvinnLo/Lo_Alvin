import java.util.Scanner;

public class APLab_08_Ex_02
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first word");
		String word1 = keyboard.next();
		int length1 = word1.length();
		
		System.out.println("Enter the second word");
		String word2 = keyboard.next();
		int length2 = word2.length();
		
		System.out.println("Enter the third word");
		String word3 = keyboard.next();
		int length3 = word3.length();
		
		
		
		System.out.println(makeCenter(word1, length1));
		System.out.println(makeCenter(word2, length2));
		System.out.println(makeCenter(word3, length3));
	}
	
	public static String makeCenter(String word, int length)
	{
		if(length >= 20)
		{
			return word;
		}
		
		else
		{
			return " " + word + " ";
		}
	
	}	
}
