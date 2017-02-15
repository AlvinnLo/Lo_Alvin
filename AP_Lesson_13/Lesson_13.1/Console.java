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
	
	public abstract String getController()
	
	public String toString()
	{
		return "Platform: " + super.getplatform() + "\n Serial #: " + super.getSerialNo() + "\n Controlller: " +getController();
	}

}