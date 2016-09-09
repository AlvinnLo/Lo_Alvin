import java.util.Scanner; //import Statement

public class ex_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(" This program calculates the area of a rectangle. ");
		
		System.out.println("Input the width please?");
		int a = keyboard.nextInt();
		
		System.out.println("Input the length please?");
		int b = keyboard.nextInt();
		
		int c = a * b;
		
		System.out.println("Area of the rectangle is " + c);
	}
}