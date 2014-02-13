public class NullGlory
	extends AbstGlory
{
	public NullGlory(String pName)
	{
		name = pName;
	}
	
	public void run()
	{
		System.out.println("There is no Glory in " + name + "!");
	}
	
	public boolean isNull()
	{
		return false;
	}
}