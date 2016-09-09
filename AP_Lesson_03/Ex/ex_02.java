import java.util.Scanner; //import Statement

public class ex_02
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height in inches?");
		int h = keyboard.nextInt();
		System.out.println("What is your weight in lb?");
		int w = keyboard.nextInt();
		int bmi = 703 * w / h / h;
		
		System.out.println("So, your metric BMI is " + bmi +".");
		
	}
}