public class APLab_12_2_Ex_06_Object
{
	private String manufacturer, name, category;
	private int UPC;
	private double price;
	
	public APLab_12_2_Ex_06_Object(String m, String n)
	{
		manufacturer = m;
		name = n;
		category = "Undefined";
		UPC = (int)(Math.random() * 1000000) + 1;
		price = 0;
	}
	
	public APLab_12_2_Ex_06_Object(String m, String n, String c, double p)
	{
		manufacturer = m;
		name = n;
		category = c;
		UPC = (int)(Math.random() * 1000000) + 1;
		price = p;
	}
	
	public String toString()
	{
		return "Product Information:\nManufacturer: " + manufacturer +
							   "\nName: " + name +
							   "\nCategory: " + category +
							   "\nUPC #: " + UPC +
							   "\nPrice: $" + price;
	}
}