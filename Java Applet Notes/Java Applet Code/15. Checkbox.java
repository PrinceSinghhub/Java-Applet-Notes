import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    Checkbox c1 = new Checkbox("Java Programming");
    Checkbox c2 = new Checkbox("HTML");
    Checkbox c3 = new Checkbox("CSS");
    public void init()
    {
        c1.setState(true);
        add(c1);
        add(c2);
        add(c3);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
