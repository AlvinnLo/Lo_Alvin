import java.util.Scanner;
public class APLab_12_2_Ex_05_Runner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input First Name");
		String firstname = keyboard.next();
		System.out.println("Please intput Last Name");
		String lastname = keyboard.next();
		System.out.println("Please intput Avatar");
		String avatar = keyboard.next();
		System.out.println("Do you want a public avatar (y or n)");
		String yon = keyboard.next();
		
		if(yon.equal("n"))
		{
			User pH = new User(firstname, lastname);
			public User(String fN, String lN)
			{
			   firstName = fN;
			   lastName = lN;
			   avatar = "Undefined";
			   userID = (int)(Math.random() * 1000000) + 1;
			}
		}
		if(yon.equal("y"))
		{
			User pH2 = new User(firstname, lastname, avatar);
			
			public User(String fN, String lN, String av)
			{
			   firstName = fN;
			   lastName = lN;
			   avatar = av;
			   userID = (int)(Math.random() * 1000000) + 1;
			}
		}	
		
		User pH = new User(firstname, lastname);
	   System.out.println(pH);
	   System.out.println();
	   User pH2 = new User(firstname, lastname, av);
	   System.out.println(pH2);
	}
}