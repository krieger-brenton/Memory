public class GloryFactory
{
	public AbstGlory getGlory(String pName)
	{
		switch(pName)
	      {
	         case "Noble":
	            return new Nobleness();
	         case "Might":
	            return new Mightiness();
	         case "Wisdom":
	            return new Wisdomness();
	         default:
	            return new NullGlory();
	      }		
	}
}
