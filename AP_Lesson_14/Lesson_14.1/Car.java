import java.util.Arrays;
public class Car implements Location
{
	private final int ID;
	private double[] location = new double[2];
	
	public Car()
	{
		ID = (int)(Math.random() * 1234567);
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}