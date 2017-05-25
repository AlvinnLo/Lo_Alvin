import java.util.ArrayList;
import java.util.Arrays;
<<<<<<< HEAD
public class toystore
{
	private ArrayList<Toy> toyList = new ArrayList<>();
	
	public toystore() {}
	
	public toystore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));

		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = this.getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
					toyList.add(new car(name));
				else if(type.equals("AF"))
					toyList.add(new afigure(name));
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return "Most Frequent Toy: " + name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t : toyList)
		{
			if(t.getType().equals("Car"))
			{
				cars ++;
			}
			if(t.getType().equals("Action Figure"))
			{
				figures ++;
			}
		}
		
		if(cars > figures)
			return "Most Frequent Type of Toy: Cars";
		if(figures > cars)
			return "Most Frequent Type of Toy: Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList + "";
=======

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
>>>>>>> origin/master
	}
}