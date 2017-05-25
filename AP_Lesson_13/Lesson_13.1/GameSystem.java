public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random() * 1234567) + 1;
	}
	
	public String getPlatform()
	{
		return this.platform;
	}
	
	public int getserialNo()
	{
		return this.serialNo;
	}
}