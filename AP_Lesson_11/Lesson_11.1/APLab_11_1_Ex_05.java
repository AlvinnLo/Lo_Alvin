import java.util.Scanner;
public class APLab_11_1_Ex_05
{
	int CLIPSIZE = 16;
	public static void main (String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
			
		int bulletCount = 96;
		int shotCount = 0;
		String [][] clip = new String [CLIPSIZE][1];
		
		resetClip();
		
		while ( int i = 0; bulletCount  > 0 ||shotCount > 0, i++)
		{
			System.out.println("Action: ");
			String action = keyboard.next();
			
			if (action == "R")
			{
				reload();
			}
			
			if (action == "S")
			{
				shoot();
			}
			System.out.print( printClip() );
		}
		System.out.println("Out of Bullets!!!");
	}
	
	public static String resetClip()
	{
		for (int i=0; 0 <= clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if (shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1;
			return "Boom!!!"
		}
		else
		{
			return "Reload!!!"
		}
	}
	
	public static String reload()
	{
		if (bulletCount >= 16)
		{
			int bulletCount -= CLIPSIZE;
			int shotCount = CLIPSIZE;
		}
		else
		{
			int ShotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for (int i = 0; 0 <= shotCount, i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static String printClip()
	{
		
	}
}