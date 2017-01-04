import java.util.Scanner;
public class APLab_11_Ex_03
{
	public static void main (String[]args)
	{
		
		String [][] xAndO = new String [4][4];
				
		for (int i = 0; i < xAndO.length; i++)
		{
			for (int j = 0; j < xAndO[i].length; j++)
			{
				int pick = 1 + (int)((Math.random()* 2));
				
				if (pick == 1)
				{
					xAndO[i][j] = "x";
				}
				
				if (pick == 2)
				{
					xAndO[i][j] = "o";
				}
				
				System.out.print( xAndO[i][j] + "\t");
				
				System.out.println("");
			}
		}
		
	}
}