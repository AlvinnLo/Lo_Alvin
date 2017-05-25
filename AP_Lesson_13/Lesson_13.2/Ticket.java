public abstract class Ticket
{
	private int serialNo;
<<<<<<< HEAD
	private double Price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 1234567) + 1;
=======
	
	public Ticket()
	{
		serialNo = (int)(Math.random()*10000000);
>>>>>>> origin/master
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
<<<<<<< HEAD
		return "serial #: " + this.serialNo + "\n price: " + this.getPrice();
=======
		return "Serial #: " + getSerialNo() + "\nPrice : " + getPrice();
>>>>>>> origin/master
	}
}