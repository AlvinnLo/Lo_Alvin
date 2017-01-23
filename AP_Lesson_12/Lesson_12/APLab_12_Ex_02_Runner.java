import java.util.Scanner;
public class APLab_12_Ex_02_Runner
{
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please intput x1");
		int x1 = keyboard.nextInt();
		System.out.println("Please intput x2");
		int x2 = keyboard.nextInt();
		System.out.println("Please intput y1");
		int y1 = keyboard.nextInt();
		System.out.println("Please intput y2");
		int y2 = keyboard.nextInt();
		
		APLab_12_Ex_02_Object object = new APLab_12_Ex_02_Object(x1, x2, y1, y2);
		System.out.println("distance = " + object.getDist());
		
	}
}