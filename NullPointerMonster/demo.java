public class demo
{
	public static void main(String[] args)
	{
		AbstMonster monster1 = MonsterFactory.getMonster("Gnoll");
		AbstMonster monster2 = MonsterFactory.getMonster("Kobold");
		AbstMonster monster3 = MonsterFactory.getMonster("Bear");
		AbstMonster monster4 = MonsterFactory.getMonster("Rat");
		
		System.out.println("Monsters:");
		System.out.println(monster1.getName());
		System.out.println(monster2.getName());
		System.out.println(monster3.getName());
		System.out.println(monster4.getName());
	}
}