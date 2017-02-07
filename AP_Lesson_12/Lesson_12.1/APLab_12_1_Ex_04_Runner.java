import java.util.Scanner;
public class APLab_12_1_Ex_04_Runner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input hair: ");
		String h = kb.nextLine();
		System.out.println("Input eye: ");
		String e = kb.nextLine();
		System.out.println("Input skin: ");
		String s = kb.nextLine();
		
		System.out.println("My info...");
<<<<<<< HEAD
		System.out.println("Hair: \t" + object.getHair());
		System.out.println("Eye: \t" + object.getEye());
		System.out.println("Skin: \t" + object.getSkin());
=======
		System.out.println("Hair: " + h);
		System.out.println("\nEyes: " + e);
		System.out.println("\nSkin: " + s);
		
		System.out.println();
		
		APLab_12_1_Ex_04_Object object = new APLab_12_1_Ex_04(h, e, s);
>>>>>>> origin/master
		
		object.setHES("Blonde", "Blue", "White");
		System.out.println("Friend's info...");
<<<<<<< HEAD
		System.out.println("Hair: \t blonde");
		System.out.println("Eye: \t blue");
		System.out.println("Skin: \t white");
=======
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s", object.getHair(), object.getEyes(), object.getSkin());
>>>>>>> origin/master
	}
}