import java.util.Scanner;
<<<<<<< HEAD
=======

>>>>>>> origin/master
public class toystorerunner
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
<<<<<<< HEAD
		{
			System.out.println("Please enter your toy list.");
			String ToyList = keyboard.nextLine();
			toystore object = new toystore(ToyList);
			System.out.println(object);
			System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
			System.out.println("Most Frequent Type: " + object.getMostFrequentType());
		}
=======
		
		System.out.println("Input list of toys");
		String toys = keyboard.nextLine();
		
		toystore object = new toystore(toys);
		
		System.out.println("List...");
		System.out.println(toys);
		System.out.println(" ");
		System.out.println("Most Frequent Toy: " + object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + object.getMostFrequentType());
		
>>>>>>> origin/master
	}
}