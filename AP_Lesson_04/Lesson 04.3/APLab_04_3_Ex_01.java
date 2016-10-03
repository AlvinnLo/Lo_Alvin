import java.util.Scanner;

public class APLab_04_3_Ex_01
{
	public static void main(String[]args)
	{
		APLab_04_3_Ex_01 Volume = new APLab_04_3_Ex_01();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter length in feet.");
		double l = keyboard.nextDouble();
		System.out.println("Enter width in feet.");
		double w = keyboard.nextDouble();
		
		double RecArea = Volume.calcPerim(l , w);
		
		System.out.printf("Your rectangle is %1.5f ft around.", RecArea );
	}
	
	public double calcPerim(double one, double two)
	{
		return one * two;
	}
}