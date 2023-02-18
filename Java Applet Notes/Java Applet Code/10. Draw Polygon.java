import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    int x [] = {20, 50, 80};
    int y [] = {80, 20, 80};
    public void paint(Graphics g)
    {
        g.drawPolygon(x, y, 3);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
