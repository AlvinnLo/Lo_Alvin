public class afigure extends toy
{
	private String name;
	private int count;

	public afigure()
	{
		this.name = "";
		this.count = 1;
	}

	public afigure (String n, int c)
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
		return "Action Figure";
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