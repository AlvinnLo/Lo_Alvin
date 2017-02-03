import java.util.Scanner;
public class APLab_12_2_Ex_05_Runner
{
	public static void main(String[]args)
	{
		String f, l, yon, av;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first name: ");
		f = kb.next();
		System.out.println("Enter last name: ");
		l = kb.next();
		System.out.println("Would you like to use a public avatar? (y or n): ");
		yon = kb.next();
		
		
		if(yon.equals("n"))
		{
			APLab_12_2_Ex_05_Object object = new APLab_12_2_Ex_05_Object(f, l);
			System.out.println(object);
		}
			
		else
		{
			System.out.println("Enter your avatar name: ");
			av = kb.next();
			APLab_12_2_Ex_05_Object object1 = new APLab_12_2_Ex_05_Object(f, l, av);
			System.out.println(object1);
		}
	}
}