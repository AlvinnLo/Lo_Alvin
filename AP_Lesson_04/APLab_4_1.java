import java.util.Scanner;

public class APLab_4_1
{
	public static void main(String[]args)
	{
		APLab_4_1 CompIn = new APLab_4_1();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter interest rate.");
		double r = keyboard.nextDouble();
		System.out.println("Enter principal (the original amount you intend to borrow).");
		double p = keyboard.nextDouble();
		System.out.println("Enter number of times the loan is compounded per year.");
		double n = keyboard.nextDouble();
		System.out.println("Enter life of the loan (in years).");
		double t = keyboard.nextDouble();
		
		double RtoPercent = r / 100;
		
		double CompoundInterest = CompIn.calcCI(RtoPercent, p ,n,t);
		
		System.out.printf("Your total monthly payment is $ %1.2f", CompoundInterest );
	}
	
	public double calcCI(double one, double two, double three, double four)
	{
		return two * Math.pow( 1 + one / three, three * four);
	}
}