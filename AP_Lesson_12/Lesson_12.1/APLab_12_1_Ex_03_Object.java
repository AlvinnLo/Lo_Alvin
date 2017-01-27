public class APLab_12_1_Ex_03_Object
{
	private String paint, interior, engine, tires; 
	
	public APLab_12_1_Ex_03_Object()
	{
		paint = "";
		interior = "";
		engine = "";
		tires = "";
	}
	
	public APLab_12_1_Ex_03_Object(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
}