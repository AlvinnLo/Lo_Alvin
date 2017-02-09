import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class toystore
{
	ArrayList<toy> toylist = new ArrayList<toy>();

	public toystore ()
	{
		ArrayList<toy> toylist = new ArrayList<>();

	}
	
	public toystore(String t)
	{
		loadToys(t);
	}
	
	public String loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			toy object = new getThatToy(object.getName()); 
			
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
				object.getCount() += 1;
			}
		}
	}
	
	public String getThatToy(String nm)
	{
		for (toy object : toylist)
		{
			if (object.getName().equals("nm"))
			{
				return object.getName();
			}
			else
			{
				return "";
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		String name = " ";
		int max = Integer.MIN_VALUE;
		
		for (toy object : toylist)
		{
			if(max < object.getCount())
			{
				max = object.getCount();
				name = object.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int car = 0;
		int figures = 0;
		
		for (toy object : toylist)
		{
			if(object.getType().equals("car"))
			{
				car +=1;
			}
			
			if(object.getType().equals("AF"))
			{
				figures +=1;
			}
		}
		
		if(car > figures)
		{
			return ("Cars");
		}
		
		if(figures > car)
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
		return toylist.toString();
	}
}