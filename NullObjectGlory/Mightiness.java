/**********************************************************
 * This is one of the glory classes. Each glory class over-
 * writes the run method differently. When these are 
 * instantiated in a thread they will each perform their run
 * methods at the same time. 
 **********************************************************/
public class Mightiness
	extends AbstGlory
{

	public void run()
	{
		try
		{
			int time = r.nextInt(999);
			System.out.println("Might thread sleeps for " + time + " milliseconds.");
			Thread.sleep(time);
			System.out.println("My Glory is in Might!");
		}
		catch (Exception e){}
	}
	
	public boolean isNull()
	{
		return false;
	}

}