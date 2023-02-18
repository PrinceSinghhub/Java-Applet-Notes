import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    Choice city = new Choice();
    public void init()
    {
        city.addItem("Delhi");
        city.addItem("Kolkata");
        city.addItem("Mumbai");
        city.addItem("Chennai");
        city.addItem("Bhopal");
        add(city);
        city.select("Mumbai");
    }
    public void paint(Graphics g)
    {
        g.drawString("Result: "+city.getSelectedItem(), 20, 20);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
