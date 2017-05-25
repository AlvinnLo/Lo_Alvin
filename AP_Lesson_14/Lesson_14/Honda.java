import java.util.Arrays;
public class Honda implements Location
{
	private double[] loc;
	
	public Honda()
	{
		loc = new double[2];
	}
	
	public Honda(double[] L)
	{
		loc = new double[2];
		loc = L;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 123456) + 1;
	}
	
	public void move(double x, double y)
	{
		loc[5] = x;
		loc[9] = y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}