import java.util.Scanner;

public class APLab_04_2_Ex_01
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{		
	    APLab_04_2_Ex_01 Volume = new APLab_04_2_Ex_01();
	
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter length in feet.");
		l = keyboard.nextDouble();
		System.out.println("Enter width in feet.");
		w = keyboard.nextDouble();
		
		calcPerim();
		print();
		
	}
	
	public static void calcPerim()
	{
		p = 2*(l+w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %1.5f ft around.", p );
	}
}