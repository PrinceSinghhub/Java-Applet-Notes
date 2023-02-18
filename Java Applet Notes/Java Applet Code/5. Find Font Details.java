import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	Font obj = new Font("Times New Roman", Font.BOLD, 40);
	Font obj1 = new Font("serif", Font.ITALIC, 20);
	public void paint(Graphics g)
	{
            g.setFont(obj);
			g.drawString("GeekyShows ", 20, 80);
			g.drawString("Font Details: " + g.getFont(), 30, 200);
			g.setFont(obj1);
			g.drawString("Welcome ", 300, 80);
			g.drawString("Font Details: " + g.getFont().getStyle(), 30, 400);
	}
}

// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>

