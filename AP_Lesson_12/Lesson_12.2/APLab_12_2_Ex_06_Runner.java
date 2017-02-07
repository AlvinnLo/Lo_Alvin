<<<<<<< HEAD
import java.util.Scanner;
public class APLab_12_2_Ex_06_Runner
{
	public static void main(String[]args)
	{
		String m, n, c, yon;
		int u;
		double p;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the manufacturer: ");
		m = kb.next();
		System.out.println("Enter the name: ");
		n = kb.next();
		System.out.println("Will you be entering category and price information? (y or n) ");
		yon = kb.next();
		
		if(yon.equals("n"))
		{
			APLab_12_2_Ex_06_Object object = new APLab_12_2_Ex_06_Object(m, n);
			System.out.println(object);
		}
		else
		{
			System.out.println("Enter the category: ");
			c = kb.next();
			System.out.println("Enter the price");
			p = kb.nextDouble();
			APLab_12_2_Ex_06_Object = new APLab_12_2_Ex_06_Object(m, n, c, p);
			System.out.println(object1);
		}
	}
=======
import java.util.Scanner;
public class APLab_12_2_Ex_06_Runner
{
	public static void main(String[]args)
	{
		String m, n, c, yon;
		int u;
		double p;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the manufacturer: ");
		m = kb.next();
		System.out.println("Enter the name: ");
		n = kb.next();
		System.out.println("Will you be entering category and price information? (y or n) ");
		yon = kb.next();
		
		if(yon.equals("n"))
		{
			APLab_12_2_Ex_06_Object object = new APLab_12_2_Ex_06_Object(m, n);
			System.out.println(object);
		}
		else
		{
			System.out.println("Enter the category: ");
			c = kb.next();
			System.out.println("Enter the price");
			p = kb.nextDouble();
			APLab_12_2_Ex_06_Object = new APLab_12_2_Ex_06_Object(m, n, c, p);
			System.out.println(object1);
		}
	}
>>>>>>> origin/master
}