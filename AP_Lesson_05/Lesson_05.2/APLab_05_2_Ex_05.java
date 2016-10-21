import java.util.Scanner;

public class APLab_05_2_Ex_05
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("There's 3 paths ahead. Which path do you want to choose?"+
		                        "\n a. Left one"+
								"\n b. Right one"+
								"\n c. Turn back?");
								
		String choice = keyboard.nextLine();
		
		if(choice.equals("a"))
		{
			System.out.println("It's a safe path!\n");
			if(choice.equals("b"))
			{
				System.out.println("There's a hole on the ground. You fell to death\n");
			}
			else if (!(choice.equals("a")))
			{
				System.out.println("There's no other path!\n");
			}
		}
		
		if (choice.equals("b"))
		{
			System.out.println("There's a hole on the ground. You fell to death\n");
			if(choice.equals("c"))
			{
				System.out.println("There's no turning back now");
			}
			else if (!(choice.equals("b")))
			{
				System.out.println("There's no other path!\n");
			}
		}
		
		if (choice.equals("c"))
		{
		    System.out.println("There's no turning back now\n");
			if (!(choice.equals("c")))
			{
				 System.out.println("There's no turning back now\n");
			}
		
			else if (!(choice.equals("c")))
			{
				System.out.println("There's no other path!\n");
			}
		}
		
	   			
		System.out.println("You saw a lake ahead. What would you want to do?"+
		                        "\n a. Use the boat your dad gave you"+
								"\n b. Use the bike your mum gave you"+
								"\n c. Check the plane you found next to the lake");
								
		String choice1 = keyboard.nextLine();
		
		if(choice1.equals("a"))
		{
			System.out.println("The boat had a hole on it! Oh no! You drowned.\n");
			if(choice1.equals("b"))
			{
				System.out.println("What do you mean? Ride on water with a bike?! What's wrong with you!\n");
			}
			else if (!(choice1.equals("a")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
		if (choice1.equals("b"))
		{
			System.out.println("What do you mean? Ride on water with a bike?! What's wrong with you!\n");
			if(choice1.equals("c"))
			{
				System.out.println("Luckily, there's a pilot in the plane! You paid $100 for a ride across the lake.\n");
			}
			else if (!(choice1.equals("b")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
		if (choice1.equals("c"))
		{
		    System.out.println("Luckily, there's a pilot in the plane! You paid $100 for a ride across the lake.\n");
			if (!(choice1.equals("c")))
			{
				 System.out.println("There's no other way\n");
			}
		
			else if (!(choice1.equals("c")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
	}
	
	     System.out.println("You got across a lake and saw a women holding a gun! What would you want to do?"+
		                        "\n a. Run away of course"+
								"\n b. Call the cops"+
								"\n c. Turn right and walk to the sign which says END OF ADVENTURE");
								
		String choice2 = keyboard.nextLine();
		
		if(choice2.equals("a"))
		{
			System.out.println("Well. I guess you have to swim across the lake now. You got eaten by a shark!\n");
			if(choice2.equals("b"))
			{
				System.out.println("Oh crap! There's no signal!\n");
			}
			else if (!(choice2.equals("a")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
		if (choice2.equals("b"))
		{
			System.out.println("Oh crap! There's no signal!\n");
			if(choice2.equals("c"))
			{
				System.out.println("LYou reached the end of your adventure safely.\n");
			}
			else if (!(choice2.equals("b")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
		if (choice2.equals("c"))
		{
		    System.out.println("You reached the end of your adventure safely.\n");
			System.out.println("END OF ADVENTURE");

			if (!(choice2.equals("c")))
			{
				System.out.println("NOOOOOO");
			}
		
			else if (!(choice2.equals("d")))
			{
				System.out.println("There's no other way!\n");
			}
		}
		
	}
}
