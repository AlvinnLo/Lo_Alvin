import java.util.Scanner;
public class APLab_12_1_Ex_03_Runner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input paint");
		String paint = keyboard.nextLine();
		System.out.println("Input interior");
		String interior = keyboard.nextLine();
		System.out.println("Input engine");
		String engine = keyboard.nextLine();
		System.out.println("Input tires");
		String tires = keyboard.nextLine();
		
		APLab_12_1_Ex_03_Object object = new APLab_12_1_Ex_03_Object(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: +\t" + object.getPaint());
		System.out.println("Interior: +\t" + object.getInterior());
		System.out.println("Engine: +\t" + object.getEngine());
		System.out.println("Tires: +\t" + object.getTires());
	}
}