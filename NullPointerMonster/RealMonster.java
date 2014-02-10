public class RealMonster
	extends AbstMonster
	{
		public RealMonster(String name)
		{
			this.name = name;
		}
		
		public boolean isNull()
		{
			return false;
		}
		
		public String getName()
		{
			return name;
		}
	}