import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    BorderLayout fl = new BorderLayout(30, 20);
    Button b1 = new Button("Submit");
    Button b2 = new Button("Play");
    Button b3 = new Button("Reset");

    
    public void init()
    {
        setLayout(fl);
        add("South",b1);
        add("East",b2);
        add("North",b3);

    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
