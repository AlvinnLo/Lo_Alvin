public abstract class toy
{
	private String name;
	private int count;

	public toy()
	{
		this.name = "";
		this.count = 1;
	}

	public toy (String n, int c)
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
		return name;
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
