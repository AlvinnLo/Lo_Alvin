public class GameRunner
{
	public static void main(String[]args)
	{
		XBox x = new XBox("XBox");
		System.out.println(x);
		
		PlayStation ps = new PlayStation("PlayStation");
		System.out.println(ps);
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}