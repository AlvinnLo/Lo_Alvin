public class APLab_12_1_Ex_03_Object
{
	private String paint, interior, engine, tires;
	
	public APLab_12_1_Ex_03_Object()
	{
		String paint = "";
		String interior = "";
		String engine = "";
		String tires = "";
	}
	
	public APLab_12_1_Ex_03_Object(String p, String i, String e, String t)
	{
		String paint = p;
		String interior = i;
		String engine = e;
		String tires = t;
	}
	
	public void setCustom(String p, String i, String e, String t)
	{
		String paint = p;
		String interior = i;
		String engine = e;
		String tires = t;
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