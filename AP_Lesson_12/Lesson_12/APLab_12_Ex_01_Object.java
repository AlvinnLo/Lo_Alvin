import java.lang.Math.*;
public class APLab_12_Ex_01_Object
{
	private int distance, hours, minutes;
	private double mph;
	
	public APLab_12_Ex_01_Object()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public APLab_12_Ex_01_Object(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	
	public void setValues(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
}