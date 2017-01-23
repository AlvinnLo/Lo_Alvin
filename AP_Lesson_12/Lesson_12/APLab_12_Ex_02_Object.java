import java.lang.Math.*;
public class APLab_12_Ex_02_Object
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public APLab_12_Ex_02_Object()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public APLab_12_Ex_02_Object(int x1,int x2,int y1,int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}
	
	public void setValues(int x1,int x2,int y1,int y2)
	{
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}