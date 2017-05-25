<<<<<<< HEAD
public class GameSystem
=======
public abstract class GameSystem
>>>>>>> origin/master
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
<<<<<<< HEAD
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 1234567) + 1;
	}
	
	public String getPlatform()
	{
		return this.platform;
=======
	public GameSystem(String p, int s)
	{
		this.platform = p;
		Random rnd = new Random();
		this.serialNo = 1000000 + rnd.nextInt(900000);
	}
		
	public String getPlatform()
	{
		return platform;
>>>>>>> origin/master
	}
	
	public int getserialNo()
	{
<<<<<<< HEAD
		return this.serialNo;
=======
		return serialNo;
>>>>>>> origin/master
	}
}