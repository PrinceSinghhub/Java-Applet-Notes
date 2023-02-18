import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    List city = new List();
    public void init()
    {
        city.add("Delhi");
        city.add("Kolkata");
        city.add("Mumbai");
        city.add("Chennai");
        city.add("Bhopal");
        add(city);
        city.select(3);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
