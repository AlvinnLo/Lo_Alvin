<<<<<<< HEAD
public class StudentAdvance extends Advance
{
	public StudentAdvance()
=======
public class StudentAdvance extends Advance 
{
	public StudentAdvance() 
>>>>>>> origin/master
	{
		super();
	}
	
<<<<<<< HEAD
	public StudentAdvance(int xs)
	{
		super(xs);
	}
	
	public double getPrice()
=======
	public StudentAdvance(int d) 
	{
		super(d);
	}
	
	public double getPrice() 
>>>>>>> origin/master
	{
		return super.getPrice()/2;
	}
	
<<<<<<< HEAD
	public String toString()
	{
		return "serial #: " + getSerialNo() + "\n price: " + getPrice() + "\nSTUDENT ID REQUIRED";
=======
	public String toString() 
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
>>>>>>> origin/master
	}
}