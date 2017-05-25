<<<<<<< HEAD
public class Toyota extends Car
{
	public Toyota(String position)
	{
		location = new double[2];
		String[] beast = position.split(", ");
		location[0] = Double.parseDouble(beast[0]);
		location[1] = Double.parseDouble(beast[1]);

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