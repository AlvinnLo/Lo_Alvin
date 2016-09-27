import java.util.Scanner;

public class APLab_04_Ex_02
{	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		APLab_04_Ex_02 form = new APLab_04_Ex_02();
	
		System.out.println("Enter your first name: ");
		String first2 = keyboard.nextLine();
		System.out.println("Enter your last name: ");
		String second2 = keyboard.nextLine();
		
		System.out.println("Enter your title:  ");
		String first3 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter the school site: ");
		String first1 = keyboard.nextLine();
		
		System.out.println("Enter the school year: ");
		String second1 = keyboard.next();
		keyboard.nextLine();
		System.out.println("What is your subject? ");
		String second3 = keyboard.nextLine();
		
		
		
		System.out.println("\n********************************************");
		
		form.format(first1, second1);
		form.format(first2, second2);
		form.format(first3, second3);
		
		
		System.out.println("\n\n********************************************");
	}	
		public void format(String first, String second)
	{
		
		System.out.printf("\n*\t%15s\t%18s*", first, second);
	}
}