import java.util.ArrayList;
import java.util.Scanner;
public class toystore
{
	public static void main (String[]args)
	{
		ArrayList<toy> toylist = new ArrayList<toy>();
	}
	
	public toystore ()
	{
		loadToys("");
	}
	
	public toystore(String t)
	{
		loadToys(t);
	}
	
	public String loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(ts.split(", "));
		for (i =0; i <= toys.size(); i++)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			toy object = new toy(getThatToy());
			
			if (object.equals(""))
			{
				if (object.equals("Car"))
				{
					toys.add(object.toString());
				}
				if (object.equals("AF"))
				{
					toys.add(object.toString());
				}
			}
			else
			{
				count += 1;
			}
		}
	}
	
	public String getThatToy(String nm)
	{
		for (i = 0; i <= toys.size; i++)
		{
			if (object.equals("nm"))
			{
				return object;
			}
			else
			{
				return "";
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		
		for (i = 0; i <= toys.size; i++)
		{
			if(max < count)
			{
				max = count;
				name = object;
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int car = 0;
		int figures = 0;
		
		for (i = 0; i <= toys.size; i++)
		{
			if(toys.getType.equals("car"))
			{
				cars +=1;
			}
			
			if(toys.getType.equals("AF"))
			{
				figures +=1;
			}
		}
		
		if(car > figures)
		{
			return ("Cars");
		}
		
		if(figures > cars)
		{
			return ("Action Figures");
		}
		
		if(car == figures)
		{
			return("Equal amounts of action figures and cars!");
		}
	}
	
	public String toString()
	{
		return toyList;
	}
}