public class RealGlory
	extends AbstGlory
{

	public RealGlory(String pName)
	{
		name = pName;
	}
	
	public void run()
	{
		System.out.println("My Glory is in " + name + "!");
	}
	
	public boolean isNull()
	{
		return true;
	}

}