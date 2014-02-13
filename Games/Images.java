import java.awt.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Images 
	extends JFrame
{
	public static void main(String[] args)
	{
		DisplayMode dm =  new DisplayMode(800,600,16, DisplayMode.REFRESH_RATE_UNKNOWN);
		
		Images i = new Images();
		i.run(dm);
	}
	
	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	
	
	public void run(DisplayMode dm)
	{
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN, 24));
		loaded = false;
		s = new Screen();
		try
		{
			s.setFullScreen(dm, this);
			try
			{
				Thread.sleep(5000);
			}
			catch (Exception e)
			{
				
			}
		}
		finally
		{
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g)
	{
		if(g instanceof Graphics2D)
		{
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			
		}
		g.drawString("This is AWESOME",  200, 200);
	}
}