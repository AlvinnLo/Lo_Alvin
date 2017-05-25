public class APLab_12_2_Ex_05_Object
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public APLab_12_2_Ex_05_Object(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public APLab_12_2_Ex_05_Object(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + firstName +
							   "\nLast Name: " + lastName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
}