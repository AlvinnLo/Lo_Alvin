<<<<<<< HEAD
import java.util.Arrays;
public class GMC extends Car
{
	public GMC(double x, double y)
	{
		location = new double[2];
		location[0] = x;
		location[1] = y;
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
	}
	
	public int getID()
	{
		return id;
>>>>>>> origin/master
	}
}