public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystem(String p, int s)
	{
		this.platform = p;
		Random rnd = new Random();
		this.serialNo = 1000000 + rnd.nextInt(900000);
	}
		
	public String getPlatform()
	{
		return platform;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
}