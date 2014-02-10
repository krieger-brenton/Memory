public class MonsterFactory
{
	private static final String[] names = {"Gnoll", "Kobold", "Bear"};
	
	public static AbstMonster getMonster(String name)
	{
		for (String i : names)
		{
			if (i.equalsIgnoreCase(name))
			{
				return new RealMonster(name);
			}
		}
		
		return new NullMonster();
	}
}