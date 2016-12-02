import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class APLab_10_Ex_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Integer [] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 78, 77, 79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		
		gFactor(numbers);
		removePrimes(numbers);
	}
	
	public static void gFactor(int nums)
	{
		System.out.println("Enter n");
		int n = keyboard.nextInt();
		if( n%nums = 0 )
		{
			return 1;
		}
		else
			return 0;
	}
	
	public static int removePrimes(int nums)
	{
		for( int i=0; i <= nums; i++)
		{
			if(gFactor(nums[i] = 0))
			{
				ArrayList.remove(i);
				i -= 1;
			}
		}
	}
}