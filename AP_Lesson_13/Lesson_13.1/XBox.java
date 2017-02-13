public abstract class XBox extends Console
{
	public XBox()
	{
		super();
	}
	
	public XBox(String p)
	{
		super(p);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getplatfom()
	{
		return "XBox";
	}

}