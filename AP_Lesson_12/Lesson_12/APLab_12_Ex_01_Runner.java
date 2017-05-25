import java.util.Scanner;
public class APLab_12_Ex_01_Runner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input distance:");
		int distance = keyboard.nextInt();
		System.out.println("Please input hours:");
		int hours= keyboard.nextInt();
		System.out.println("Please input minutes:");
		int minutes = keyboard.nextInt();
		
		APLab_12_Ex_01_Object object = new APLab_12_Ex_01_Object(distance, hours, minutes);
		
		System.out.println( distance + " miles in " + hours + " hours = " + object.getMPH() + " mph");
	}
}