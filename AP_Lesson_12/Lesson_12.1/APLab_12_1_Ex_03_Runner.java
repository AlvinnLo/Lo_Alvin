import java.util.Scanner;
public class APLab_12_1_Ex_03_Runner
	public static void main(String[]args)
	{
		String p = "";
		String i = "";
		String e = "";
		String t = "";
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input paint: ");
		p = kb.nextLine();
		System.out.println("Input interior: ");
		i = kb.nextLine();
		System.out.println("Input engine: ");
		e = kb.nextLine();
		System.out.println("Input tires: ");
		t = kb.nextLine();
		
		APLab_12_1_Ex_03_Object object = new APLab_12_1_Ex_03_Object(p, i, e, t);
		
		System.out.println("Your vehicle is ready......");
		System.out.println("Paint: +\t" + object.getPaint());
		System.out.println("Interior: +\t" + object.getInterior());
		System.out.println("Engine: +\t" + object.getEngine());
		System.out.println("Tires: +\t" + object.getTires());
	}
}