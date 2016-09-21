import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		APLab_04 form = new APLab_04();
	
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
		
		String item4 = "Subtotal";
		Double price4 = price1 + price2 +price3;
		String item5 = "Tax";
		Double price5 = price4 * 0.0825;
		String item6 = "Total";
		Double price6 = price4 + price5;
		
		
		System.out.println("\n<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		
		form.format(item4, price4);
		form.format(item5, price5);
		form.format(item6, price6);
		
		System.out.println("\n__________________________________________");
		System.out.println("\n * Thank you for your support *");
		
		
	}
	public void format(String item, double price)
	{
		
		System.out.printf("\n*\t%20s ........ \t%10.2f", item, price);
	}
	

}