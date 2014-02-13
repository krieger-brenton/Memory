public class GloryFactory
{
	public AbstGlory getGlory(String pName)
	{
		String[] NamesOfGlory = { "Valor", "Might", "Wisdom" };
		
		for(String glory : NamesOfGlory)
		{
			if (glory == pName)
			{
				return new RealGlory(pName);
			}
		}
		
		return new NullGlory(pName);
	}
}