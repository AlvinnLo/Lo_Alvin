import java.util.Scanner;

public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input list of toys");
		String toys = keyboard.nextLine();
		
		toystore object = new toystore(toys);
		
		System.out.println("List...");
		System.out.println(toys);
		System.out.println(" ");
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + object.getMostFrequentType());
		
	}
}