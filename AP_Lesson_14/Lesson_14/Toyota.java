import java.util.Arrays;
public class Toyota implements Location
{
	private String location;
	
	public Toyota()
	{
		location = "";
	}
	
	public Toyota(String L)
	{
		location = L;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 123456) + 1;
	}
	
	public void move(String L)
	{
		location = L;
	}
	
	public double[] getLoc()
	{
		double[] Location = new double[2];
		String[] loca = location.split(", ");
		Location[0] = Double.parseDouble(loca[0]);
		Location[1] = Double.parseDouble(loca[1]);
		return Location;
	}
}