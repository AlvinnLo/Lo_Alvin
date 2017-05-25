public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int xs)
	{
		super(xs);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "serial #: " + getSerialNo() + "\n price: " + getPrice() + "\nSTUDENT ID REQUIRED";
	}
}