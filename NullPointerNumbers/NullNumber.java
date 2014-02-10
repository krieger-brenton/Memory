public class NullNumber
   extends AbstNumber
{
   public NullNumber()
   {
      mNum = 0;
   }

   public int getMNum()
   {
      System.out.println("This object is empty");
      return mNum;
   }
 
   public boolean isNull()
   {
      return true;
   }
}
   