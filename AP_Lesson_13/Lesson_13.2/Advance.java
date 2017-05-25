<<<<<<< HEAD
public class Advance extends Ticket
{
	private int daysLeft;
	public Advance()
=======
public class Advance extends Ticket 
{
	private int daysLeft;
	
	public Advance() 
>>>>>>> origin/master
	{
		super();
	}
	
<<<<<<< HEAD
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
=======
	public Advance(int d) 
	{
		this.daysLeft = d;
	}
	
	public double getPrice() 
	{
		if (daysLeft >= 10) 
		{
			return 30.00;
		}
		
		else return 40.00;
>>>>>>> origin/master
	}
}