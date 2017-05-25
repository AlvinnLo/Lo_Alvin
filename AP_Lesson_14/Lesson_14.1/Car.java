<<<<<<< HEAD
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
=======
public class Car implements Location 
{
	public final int id = (int)(Math.random()*1000000);
	public double[] location;
	
	public Car() 
	{
		location = new double[2];
	}
	
	public Car(double x, double y) 
	{
		location = new double [2];
		location[0] = x;
		location[1] = y;
	}
	
	public int getID() 
	{
		return id;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc() 
>>>>>>> origin/master
	{
		return location;
	}
}