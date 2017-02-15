public class StudentAdvance extends Ticket
{
	private int daysLeft;
	
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
		{
			return 15.00;
		}
		else
		{
			return 20.00;
		}
	}
	
	public String toString()
	{
		return super.toString() + "\n (STUDENT ID REQUIRED)"
	}
}