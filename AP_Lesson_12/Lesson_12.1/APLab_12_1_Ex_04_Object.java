public class APLab_12_1_Ex_04_Object
{
	private String hair, eyes, skin;
	
	public APLab_12_1_Ex_04_Object()
	{
		String hair = "";
		String eyes = "";
		String skin = "";
	}
		
	public APLab_12_1_Ex_04_Object(String h, String e, String s)
	{
		String hair = h;
		String eyes = e;
		String skin = s;
	}
		
	public void setHES(String h, String e, String s)
	{
		String hair = h;
		String eyes = e;
		String skin = s;
	}
		
	public String getHair()
	{
		return hair;
	}
		
	public String getEyes()
	{
		return eyes;
	}
		
	public String getSkin()
	{
		return skin;		
	}
}