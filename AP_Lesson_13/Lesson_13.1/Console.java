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
	
<<<<<<< HEAD
	public abstract String getController();
	
	public String toString()
	{
		return "platform: " + super.getPlatform() + "\n serial #: " + super.getserialNo() + "\n controller: " + getController();
	}
=======
	public abstract String getController()
	
	public String toString()
	{
		return "Platform: " + super.getplatform() + "\n Serial #: " + super.getSerialNo() + "\n Controlller: " +getController();
	}

>>>>>>> origin/master
}