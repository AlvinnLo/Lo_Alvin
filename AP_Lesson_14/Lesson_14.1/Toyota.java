<<<<<<< HEAD
import java.util.Arrays;
import java.util.ArrayList;
public class Toyota extends Car
{
	public Toyota(String position)
	{
		super();
		ArrayList<String> beast = new ArrayList<>(Arrays.asList(position.split(", ")));
		Double positionEX = Double.parseDouble(beast.get(0));
		Double positionWHY = Double.parseDouble(beast.get(1));
		super.move(positionEX, positionWHY);
=======
public class Toyota extends Car 
{
	public Toyota() 
	{
		super();
	}
	
	public Toyota(String l) 
	{
		super(Double.parseDouble(l.split(", ")[0]), Double.parseDouble(l.split(", ")[1]));
>>>>>>> origin/master
	}
}