import java.util.Scanner;

public class APLab_04_2_Ex_04
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{		
	    APLab_04_2_Ex_04 Volume = new APLab_04_2_Ex_04();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter radius of circle.");
		r = keyboard.nextDouble();
		
		calcArea();
		print();
		
	}
	
	public static void calcArea()
	{
		area = 3.14159* (Math.pow (r, 2));
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a radius of %1.5f is %1.5f.", r, area );
	}
}