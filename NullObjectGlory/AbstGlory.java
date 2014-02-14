import java.util.Random;
/**********************************************************
 * This is the superclass to all the other glory classes 
 * by having the glory classes all inherit from this class
 * we can use polymorphism in our Glory Factory. 
 **********************************************************/
public abstract class AbstGlory
	implements Runnable
{	
	protected Random r = new Random();
	abstract boolean isNull();
}