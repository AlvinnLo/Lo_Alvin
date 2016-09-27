public class Lab_02
{
	public static void main (String[]args)
	{
		int a = 2;
		int b = 4;
		int sum = a * b;
		
		System.out.println(a + " multiplied by " + b +" is "+ sum);
		
		String name = "Name";
		String address = "Home Address";
		String city = "City";
		String zip = "Zip Code";
		System.out.println(name);
		System.out.println(address);
		System.out.println(city + "  "  +zip);
		
		int h = 5;
		int w = 3;
		int l = 4;
		int surfacearea = 2 * w * l + 2 * l * h + 2 * h * w;
		
		System.out.println("The surface area of your rectangle is " + surfacearea);
	}
}