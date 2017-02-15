public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xb = new XBox("XBox");
		ThePC pc = new ThePC("PC");
		PlayStation ps = new PlayStation("PlayStation");
		
		System.out.println(xb);
		System.out.println(ps);
		System.out.println(pc);
	}
}