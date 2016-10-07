import java.util.Random;

public class APLab_05_Ex_01
{
	public static void main(String[]args)
	{
	
		
		int user = 1 + (int)((Math.random()*6));
		int comp = 1 + (int)((Math.random()*6));
		
		String Winner =  rollDice(user, comp);
		
		System.out.println("You rolled a " + user);
		System.out.println("Computer rolled a " + comp);
		System.out.println("The winner is " + Winner);
		
	}
	
		static String Winner;
	public static String rollDice(int user, int comp)
	{
		
		
		if (user > comp)
		{
			Winner = "user";
		}
		
		if (comp > user)
		{
			Winner = "Computer";
		}
		
		return Winner;
	}
}