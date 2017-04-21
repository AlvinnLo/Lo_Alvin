public class Toyota extends Car 
{
	public Toyota() 
	{
		super();
	}
	
	public Toyota(String l) 
	{
		super(Double.parseDouble(l.split(", ")[0]), Double.parseDouble(l.split(", ")[1]));
	}
}