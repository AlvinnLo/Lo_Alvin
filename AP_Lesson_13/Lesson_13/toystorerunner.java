import java.util.Scanner;
public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		{
			System.out.println("Please enter your toy list.");
			String ToyList = keyboard.nextLine();
			toystore object = new toystore(ToyList);
			System.out.println(object);
			System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
			System.out.println("Most Frequent Type: " + object.getMostFrequentType());
		}
	}
}