import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    Label lb1 = new Label("First Name: ");
    TextField t1 = new TextField(10);
    public void init()
    {
        add(lb1);
        add(t1);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
