public class APLab_12_1_Ex_04_Object
{
	private String hair, eyes, skin;
	
	public APLab_12_1_Ex_04()
	{
		hair = " ";
		eyes = " ";
		skin = " ";
	}
	
	public APLab_12_1_Ex_04(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
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