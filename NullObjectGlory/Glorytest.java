/**********************************************************
 * Main is only for testing. This makes an instance of
 * GloryFactory and then uses it to make four instances 
 * of Glory before it calls their start methods.
 **********************************************************/
public class Glorytest
 
{
	public static void main(String[] args)
	{
		GloryFactory gf = new GloryFactory();
		
		Thread t1 = new Thread(gf.getGlory("Noble"));
		Thread t2 = new Thread(gf.getGlory("Wisdom"));
		Thread t3 = new Thread(gf.getGlory("Might"));
		Thread t4 = new Thread(gf.getGlory("Cowardness"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}