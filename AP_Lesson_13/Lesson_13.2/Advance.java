public class Advance extends Ticket
{
	private int daysLeft;
	public Advance()
	{
		super();
	}
	
	public Advance(int xs)
	{
		super();
		daysLeft = xs;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
			return 30;
		else
			return 40;
	}
}