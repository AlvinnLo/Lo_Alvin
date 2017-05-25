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
	}
}