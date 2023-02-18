import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("HTML", cg, false);
    Checkbox c2 = new Checkbox("CSS", cg, false);
    Checkbox c3 = new Checkbox("JS", cg, true);
    Checkbox c4 = new Checkbox("JQ", cg, false);
    public void init()
    {
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
