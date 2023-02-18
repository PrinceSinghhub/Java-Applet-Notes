import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	public void paint(Graphics g)
	{
            String str = this.getParameter("msg");
            g.drawString(str, 100, 80);
	}
}

// <APPLET code="Myapplet.class" NAME="New Applet" width = "200" height = "150"> </APPLET>

