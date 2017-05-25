import java.util.Arrays;
import java.util.ArrayList;
public  abstract class Car implements Location
{
	public int id;
	public double[] location;

	public Car ()
	{
		location = new double [2];
		id = (int)(Math.random()*1000000);
	}
	
	public Car (double x, double y)
	{
		location = new double [2];
		location [0] = x;
		location [1] = y;
		id = (int)(Math.random()*1000000);
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double x, double y)
	{
		location [0] = x;
		location [1] = y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}