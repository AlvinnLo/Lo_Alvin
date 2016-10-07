import java.util.Scanner;

public class APLab_05_Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		APLab_05_Ex_02 form = new APLab_05_Ex_02();

		System.out.println("Please enter item 1: ");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price: ");
		Double price1 = keyboard.nextDouble();
		
		System.out.println("Please enter item 2: ");
		String item2 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Please enter the price: ");
		Double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3: ");
		String item3 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Please enter the price: ");
		Double price3 = keyboard.nextDouble();
		
		System.out.println("Please enter item 4: ");
		String item4 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Please enter the price: ");
		Double price4 = keyboard.nextDouble();
		
		String item5 = "Subtotal";
		Double price5 = price1 + price2 +price3+price4;
		String item6 = "Tax";
		Double price6 = price5 * 0.0825;
		String item7 = "Total";
		Double price7 = price5 + price6;
		String item8 = "Discount";
		Double price8 = discount(price6);
		
		
		System.out.println("\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		
		form.format(item5, price5);
		form.format(item6, price6);
		form.format(item7, price7);
		form.format(item8, price8);
		
		System.out.println("\n__________________________________________");
		
		
	}
	
	static double price8;
	public static double discount(double price6)
	{
		if(price6 >= 2000)
		{
			price8 = price7 * 0.85;
		}
		if(price6 < 2000)
		{
			price8 = price7;
		}
		return price8;
	}
	
	public void format(String item, double price)
	{
		
		System.out.printf("\n*\t%15s ........ \t%10.2f", item, price);
	}
	
	
}