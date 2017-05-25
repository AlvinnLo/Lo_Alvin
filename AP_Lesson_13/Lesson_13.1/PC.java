public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String l)
	{
		super(l);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "platform: " + super.getPlatform() + "\n serial #: " + super.getserialNo() + "\n system Input: " + systemInput();
	}
}