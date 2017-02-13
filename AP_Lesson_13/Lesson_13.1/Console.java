public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() + "\n Serial #: " + getSerialNo() + "\n Controlller: " +getController();
	}

}