public class demo
{
   public static void main(String[] args)
   {
      AbstNumber number1 = NumberFactory.getNumber(5);
      AbstNumber number2 = NumberFactory.getNumber(10);
      AbstNumber number3 = NumberFactory.getNumber(15);
      AbstNumber number4 = NumberFactory.getNumber(-20);

      System.out.println("The Numbers:");
      System.out.println(number1.getMNum());
      System.out.println(number2.getMNum());
      System.out.println(number3.getMNum());
      System.out.println(number4.getMNum());

      System.out.println("-------------------------");

      AbstNumber[] nums = {number1, number2, number3, number4};
      for(AbstNumber num : nums)
      {
         if(!num.isNull())
         {
            System.out.println(num.getMNum());
         }
      }
   }
}