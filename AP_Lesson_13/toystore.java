import java.util.ArrayList;
import java.util.Scanner;
public class toystore
{
	public static void main (String[]args)
	{
		ArrayList<toy> inventory = new ArrayList<toy>();
		inventory.add(new afigure(name, count))
		inventory.add(new toy(name, count))
	}
	
	public toystore ()
	{
		name = "";
		count = 0
	}
	
	public toystore(String nm, int c)
	{
		name = nm;
		count = c;
	}
	
	public String loadToys()
	{
		ArrayList<String> toys = new ArrayList<String>();
		for (i =1; i <= toys.size(); i++)
		{
			toys.set (i, name)
			toys.set (i + 1, type)
			toy object = new toy(nm)
			if (nm.equals(""))
			{
				if (nm.equals("Car"))
				{
					return car;
				}
				if (nm.equals("AF"))
				{
					return AFigure;
				}
			}
			else
			{
				count += 1;
			}
		}
	}
	
	public String getThatToy(nm)
	{
		for (i = 1; i <= toys.size; i++)
		{
			if (name.equals("nm"))
			{
				return
			}
		}
	}
}