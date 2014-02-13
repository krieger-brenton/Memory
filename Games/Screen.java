import java.awt.*;
import javax.swing.JFrame;

public class Screen
{
	private GraphicsDevice vc;
	//takes control of graphics card/ control what goes on to the screen
	
	public Screen()
	{
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	
	public void setFullScreen(DisplayMode dm, JFrame window)
	{
		window.setUndecorated(true);
		window.setResizable(false);
		vc.setFullScreenWindow(window);
		
		if(dm != null && vc.isDisplayChangeSupported())
			//if there are settings, and if they can be displayed
		{
			try
			{
				vc.setDisplayMode(dm);
			}
			catch(Exception e)
			{
				
			}
		}
		
	}
	
	public Window getFullScreenWindow()
	{
		return vc.getFullScreenWindow();
	}
	
	public void restoreScreen()
	{
		Window w = vc.getFullScreenWindow();
		if (w != null) // if its gone send if off for garbage collector
		{
			w.dispose();
		}
		vc.setFullScreenWindow(null);
	}
}