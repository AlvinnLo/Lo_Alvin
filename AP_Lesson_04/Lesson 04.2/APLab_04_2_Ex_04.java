import java.util.Scanner;

public class APLab_04_2_Ex_04
{
	public static void main(String[]args)
	{
		APLab_04_2_Ex_04 Volume = new APLab_04_2_Ex_04();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius of circle.");
		double r = keyboard.nextDouble();
		
		double area = Volume.calcArea(r);
		
		System.out.printf("The area of a circle with a radius of r is %1.5f.", area );
	}
	
	public double calcArea(double one)
	{
		return 3.14159* (Math.pow (one, 2));
	}
}