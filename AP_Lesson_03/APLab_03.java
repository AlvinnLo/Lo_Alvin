import java.util.Scanner; //import Statement

public class APLab_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.");
		
		System.out.println("I'd like to ask you a few questions.");
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println(name + "?!!! Why would anyone name a baby that?");
		
		System.out.println("How old are you, " + name +"?");
		int num = keyboard.nextInt();
		System.out.println("Oooooo!!! " + num +" is getting up there.");
		keyboard.nextLine();
		System.out.println("What do you do for fun, " + name + "?");
		String doo = keyboard.nextLine();
		System.out.println("I thought only nerds like to " + doo + "?");
		
		System.out.println("What kind of music to you like?");
		String music = keyboard.nextLine();
		System.out.println("Boooo!!! I wouldn't wish the sound of " + music +" on my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println( siblings + "? Wow, I hope the rest of your family is better looking.");
		keyboard.nextLine();
		System.out.println("What do you want to be when you grow up?");
		String job = keyboard.nextLine();
		System.out.println("I think you'd have to be smarter to be a" + job +".");
		
		System.out.println("So " + name +", you're " + num +"...");
		System.out.println("You like to " + doo +" and listen to " + music +"...");
		System.out.println("Good luck becoming a" + job +".");
		System.out.println("I'm only kiddin' " + name +".");
		
		System.out.println("What is your height in inches?");
		double h = keyboard.nextDouble();
		System.out.println("What is your weight in lb?");
		double w = keyboard.nextDouble();
		int j = 703;
		
		double bmi = j * w / h / h;
		
		System.out.println("So, your metric BMI is " + bmi +".");
		
		System.out.println(" This program calculates the area of a rectangle. ");
		
		System.out.println("Input the width please?");
		double a = keyboard.nextDouble();
		
		System.out.println("Input the length please?");
		double b = keyboard.nextDouble();
		
		double c = a * b;
		
		System.out.println("Area of the rectangle is " + c);
	}
}