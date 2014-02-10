public class NumberFactory
{
   public static AbstNumber getNumber(int pNum)
   {
      if(pNum >= 0)
      {
         return new RealNumber(pNum);
      }
      else
      {
         return new NullNumber();
      }
   }
}