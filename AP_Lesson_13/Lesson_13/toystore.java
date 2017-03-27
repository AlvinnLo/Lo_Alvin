import java.util.ArrayList;
import java.util.Arrays;

public class toyStore 
{	
	private ArrayList<toy> toyList;
	public toyStore() 
	{
		
		toyList = new ArrayList<toy>();
		loadtoys("");
	}

	public toyStore(String t) 
	{
		toyList = new ArrayList<toy>();
		loadtoys(t);
	}
	
	public void loadtoys(String ts) 
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		String name;

		for (int i = 0; i < toys.size(); i+=2) 
		{
			name = toys.get(i);
			String type = toys.get(i+1);
			if (type.equals("AF")) 
			{
				afigure object1 = new afigure(name);
				
				if (GetThatToy(name)) 
				{
					object1.setCount(object1.getCount()+1);
					for (int j = 0; j < toyList.size(); j++) 
					{
						if (toyList.get(j).getName().equals(object1.getName())) 
						{
							toyList.set(j, object1);
						}
					}
				}
				
				else toyList.add(object1);
			}
			else 
			{
				car object2 = new car(name);
				if (GetThatToy(name)) 
				{
					object2.setCount(object2.getCount()+1);
					for (int j = 0; j < toyList.size(); j++) 
					{
						if (toyList.get(j).getName().equals(object2.getName())) 
						{
							toyList.set(j, object2);
						}
					}
				}
				else toyList.add(object2);
			}

		}
	}

	public boolean GetThatToy(String nm) 
	{
		for (toy object : toyList) 
		{
			if (object.getName().equals(nm)) 
			{
				return true;
			}
		}
		return false;
	}

	public String getMostFrequenttoy() 
	{
		String name = "";

		int max = Integer.MIN_VALUE;

		for (toy object : toyList) 
		{
			if (max < object.getCount()) 
			{
				max = object.getCount();
				name = object.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType() 
	{
		int cars = 0;
		int figures = 0;

		for (toy object : toyList) 
		{
			if (object.getType().equals("car")) 
			{
				cars++;
			}
			
	
			else if (object.getType().equals("Action Figure")) 
			{
				figures++;
			}
		}
		

		if (cars > figures) 
		{
			return "Cars";
		}

		else if (figures > cars) 
		{
			return "Action Figures";
		}
	
		else 
		{
			return "Equal amounts of action figures and cars!";
		}
	}

	public String toString() 
	{
		return toyList.toString();
	}
}