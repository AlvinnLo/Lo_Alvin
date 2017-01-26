import java.util.Scanner;
public class APLab_12_1_Ex_04_Runner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input hair");
		String paint = keyboard.nextLine();
		System.out.println("Input eye");
		String interior = keyboard.nextLine();
		System.out.println("Input skin");
		String engine = keyboard.nextLine();
		
		APLab_12_1_Ex_04_Object object = new APLab_12_1_Ex_04_Object(hair, eye, skin);
		
		System.out.println("My info...");
		System.out.println("Hair: +\t" + object.getHair());
		System.out.println("Eye: +\t" + object.getEye());
		System.out.println("Skin: +\t" + object.getSkin());
		
		System.out.println("Friend's info...");
		System.out.println("Hair: blonde");
		System.out.println("Eye: blue");
		System.out.println("Skin: white");
	}
}