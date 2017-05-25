import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
	   double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));
	   
	   double[] home = {0, 0};

       String printout = "\n\n" +
              "==========================" + "\nStarting locations...";
	
       for(Location loc : locate)
	   {
		   printout += "\nLocation for " + loc.getID() + getLocation(loc.getLoc());
	   }

       printout += "\n\nDistance from home...";

       for (Location loc : locate)
       {
           printout += "\nDistance for " + loc.getID() + ": " + getDistance(loc.getLoc(), home);
       }
	   
	   printout += "\n\n==========================";
	   
	   for(Location loc : locate)
	   {
		   double one = Math.random()* 100;
		   double two = Math.random()* 100;
		   loc.move(one, two);
		   double[] l = {one, two};
			printout += "\nAfter " + loc.getID() + " moved " + getLocation(l)
					+"\nNew Location: " + getLocation(loc.getLoc()) + "\n";
	   }
	   printout += "\nDistance from home...";

       for (Location loc : locate)
       {
           printout += "\nDistance for " + loc.getID() + ": " + getDistance(loc.getLoc(), home);
       }
	   
       System.out.println(printout);
   }

    public static String getDistance(double[] Location, double[] home)
   {
       return String.format("(%.2f)", Math.sqrt((Math.pow(Location[0] - home[0], 2)+ Math.pow(Location[1] - home[1], 2))));
   }

    public static String getLocation(double[] loc)
   {
       return String.format("(%.2f, %.2f)", loc[0], loc[1]);
   }
=======
public class Satellite {
	public static void main(String[]args) {
		ArrayList<Location> locate = new ArrayList<>();
		double[] honLoc = {5, 6};
		Honda h1 = new Honda(honLoc);
		Toyota t1 = new Toyota(8, 9);
		GMC g1 = new GMC(3,8);
		locate.add(h1);
		locate.add(t1);
		locate.add(g1);
		
		double[] home = {0, 0};
		
		String printout = "\n\n" + 
			"==========================" + "\nStarting locations...";

        for (Location l : locate)
		{
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
		}

		printout += "\n\n" + "==========================" +
			"\nDistance from home...";

		for (Location l : locate)
		{
			printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home) + ")";
		}

		System.out.println(printout);
		
		ArrayList<Double> movement = new ArrayList<>();
		movement.add(Math.random()*100);
		movement.add(Math.random()*100);
		movement.add(Math.random()*100);
		movement.add(Math.random()*100);
		movement.add(Math.random()*100);
		movement.add(Math.random()*100);
		h1.move(movement.get(0), movement.get(1));
		t1.move(movement.get(2), movement.get(3));
		g1.move(movement.get(4), movement.get(5));
		locate.set(0, h1);
		locate.set(1, t1);
		locate.set(2, g1);
		printout = "\n\n" + "==========================";
		int i = 0;

        for (Location l : locate)
		{
			printout += "\nAfter " + l.getID() + " Moved (" + String.format("%.2f", movement.get(i)) + ", "
					+ String.format("%.2f", movement.get(i+1)) + ")\nNew Location: (" + getLocation(l.getLoc()) + ")";
			i+=2;
		}

		printout += "\n\n" + "==========================" + "\nDistance from home...";

		for (Location l : locate)
		{
			printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home) + ")";
		}

		System.out.println(printout);
		
	}

	public static String getDistance(double[] car, double[] home)
	{
		return String.format("%.2f", Math.pow(car[0] - home[0], 2) + Math.pow(car[1] - home[1], 2));
	}

	public static String getLocation(double[] loc)
	{
		return String.format("%.2f, %.2f", loc[0], loc[1]);
	}
>>>>>>> origin/master
}