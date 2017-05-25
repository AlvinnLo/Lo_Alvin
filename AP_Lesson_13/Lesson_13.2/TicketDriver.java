public class TicketDriver
{
	public static void main(String[]args)
	{
<<<<<<< HEAD
		Walkup w = new Walkup();
		System.out.println(w);
		
		Advance a = new Advance();
		System.out.println(a);
		
		StudentAdvance sa = new StudentAdvance();
		System.out.println(sa);
=======
		Advance ad = new Advance(1);
		StudentAdvance sa = new StudentAdvance(1);
		Walkup wu = new Walkup(1);
		
		System.out.println("Recipt");
		System.out.println("1 Advance Ticket :\t" + ad);
		System.out.println("1 Student Advance Ticket :\t" + sa);
		System.out.println("1 Walkup Ticket: +\t" + wu);
>>>>>>> origin/master
	}
}