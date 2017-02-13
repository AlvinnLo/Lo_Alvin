public abstract class ThePC extends GameSystem
{
	public ThePC()
	{
		super();
	}
	
	public ThePC(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + getplatform() + "\n Serial #: " + getSerialNo() + "\n Controlller: " +systemInput();
	}

}