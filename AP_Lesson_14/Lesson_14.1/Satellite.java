import java.util.ArrayList;
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
		   double[] l = {one, two};
			((Car)loc).move(one, two);
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
}