import java.util.ArrayList;
import java.util.Arrays;
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
	}
}