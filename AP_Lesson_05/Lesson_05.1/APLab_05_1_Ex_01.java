import java.util.Scanner;

public class APLab_05_1_Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your grade for your period 1 class in CAPITAL letter.");
		String grade1 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 2 class in CAPITAL letter.");
		String grade2 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 3 class in CAPITAL letter.");
		String grade3 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 4 class in CAPITAL letter.");
		String grade4 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 5 class in CAPITAL letter.");
		String grade5 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 6 class in CAPITAL letter.");
		String grade6 = keyboard.nextLine();
		
		System.out.println("Enter your grade for your period 7 class in CAPITAL letter.");
		String grade7 = keyboard.nextLine();
		
		double gPoints = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		
		double GPA = gPoints /7;
		
		System.out.printf("Your GPA is %1.2f", GPA);
		
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		
		if (grade.equals("B"))
			return 3.0;
		
		if (grade.equals("C"))
			return 2.0;
		
		if (grade.equals("D"))
			return 1.0;
		
		return 0.0;
		
	}
	
}