import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	Color obj = new Color(255, 53, 152);
	public void paint(Graphics g)
	{
		g.setColor(obj);
		g.drawString("GeekyShows ", 20, 80);
		g.drawString("GeekyShows ", 30, 150);
		g.setColor(Color.red);
		g.drawString("GeekyShows ", 40, 200);
	}
}

// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>

