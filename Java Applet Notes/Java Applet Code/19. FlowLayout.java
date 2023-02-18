import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 30, 20);
    Button b1 = new Button("Submit");
    Button b2 = new Button("Play");
    Button b3 = new Button("Reset");

    
    public void init()
    {
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);

    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
