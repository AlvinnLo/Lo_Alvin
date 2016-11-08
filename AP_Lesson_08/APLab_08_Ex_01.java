import java.util.Scanner;

public class APLab_08_Ex_01
{
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		String sentence = keyboard.nextLine();
		System.out.println(replace(sentence));
		
	}
	
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ")<0) 
		{
			return sentence;
		}
		else
		{
			return sentence = sentence.substring(0, sentence.indexOf(" "))+ "_" + sentence.substring(sentence.indexOf(" ")+1 );
		}
	}	
}
