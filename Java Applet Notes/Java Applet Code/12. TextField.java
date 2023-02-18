import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    TextField t1 = new TextField("Hello");
    public void init()
    {
        add(t1);
    }
    public void paint(Graphics g)
    {
        g.drawString("Result: "+t1.getText(), 80, 50);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
