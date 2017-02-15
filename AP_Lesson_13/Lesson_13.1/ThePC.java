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
		return "Platform: " + super.getplatform() + "\n Serial #: " + super.getSerialNo() + "\n Controlller: " +systemInput();
	}

}