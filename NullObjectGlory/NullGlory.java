/**********************************************************
 * This is the Null Object it overwrites the isNull function
 * from its superclass and then has the run method do 
 * nothing.
 **********************************************************/
public class NullGlory
	extends AbstGlory
{

	public void run()
	{
		// I do nothing
	}
	
	public boolean isNull()
	{
		// This is for the user to test for a null object 
		// if they need to
		return true;
	}
}