public class car extends toy
{
	private String name;
	private int count;

	public car()
	{
		this.name = "";
		this.count = 1;
	}

	public car (String n, int c)
	{
		this.name = n;
		this.count = c;
	}

	public void setName(String n)
	{
		this.name = n;
	}

	public void setCount(int c)
	{
		this.count = c;
	}

	public String getName()
	{
		return "Car";
	}

	public int getCount()
	{
		return count;
	}

	public String toString()
	{
		return "[Name] [Count]";
	}
}