import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
	public void paint(Graphics g)
        {
            g.setColor(Color.red);
            g.drawRect(20, 20, 70, 50);
	}
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
