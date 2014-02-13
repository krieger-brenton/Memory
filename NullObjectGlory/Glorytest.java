public class Glorytest
{
	public static void main(String[] args)
	{
		GloryFactory gf = new GloryFactory();
		
		Thread t1 = new Thread(gf.getGlory("Valor"));
		Thread t2 = new Thread(gf.getGlory("Wisdom"));
		Thread t3 = new Thread(gf.getGlory("Cowardness"));
		
		t1.start();
		t2.start();
		t3.start();
	}
}