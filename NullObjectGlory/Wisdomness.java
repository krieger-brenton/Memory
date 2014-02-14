/**********************************************************
 * This is one of the glory classes. Each glory class over-
 * writes the run method differently. When these are 
 * instantiated in a thread they will each perform their run
 * methods at the same time. 
 **********************************************************/
public class Wisdomness
	extends AbstGlory
{

	public void run()
	{
		try
		{
			int time = r.nextInt(999);
			System.out.println("Wisdom thread sleeps for " + time + " milliseconds.");
			Thread.sleep(time);
			System.out.println("My Glory is in Wisdom!");
		}
		catch(Exception e){}
	}
	
	public boolean isNull()
	{
		return false;
	}

}