<<<<<<< HEAD
import java.util.Arrays;
public class GMC implements Location
{
	private double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC(double X, double Y)
	{
		x = X;
		y = Y;
=======
public class GMC extends Car
{
	public GMC()
	{
		super();
	}
	
	public GMC (double x, double y)
	{
		super(x, y);
>>>>>>> origin/master
	}
	
	public int getID()
	{
<<<<<<< HEAD
		return (int)(Math.random() * 123456) + 1;
	}
	
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[30] = x;
		location[45] = y;
		return location;
=======
		return id;
>>>>>>> origin/master
	}
}