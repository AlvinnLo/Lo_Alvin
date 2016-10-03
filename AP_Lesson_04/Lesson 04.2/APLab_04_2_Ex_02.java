import java.util.Scanner;

public class APLab_04_2_Ex_02
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;
	
	public static void main(String[]args)
	{		
	   
		APLab_04_2_Ex_02 Average = new APLab_04_2_Ex_02();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first number.");
		num1 = keyboard.nextDouble();
		System.out.println("Enter second number.");
		num2 = keyboard.nextDouble();
		System.out.println("Enter third number.");
		num3 = keyboard.nextDouble();
		
		Average();
		print();
		
	}
	
	public static void Average()
	{
		avg = (num1 + num2 + num3)/3 ;
	}
	
	public static void print()
	{
		System.out.printf("The average of %1.5f, %1.5f, and %1.5f is %1.5f.", num1, num2, num3, avg );
	}
}