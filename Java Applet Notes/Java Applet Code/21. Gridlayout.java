import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    GridLayout fl = new GridLayout(2, 3, 20, 10);
    Button b1 = new Button("One");
    Button b2 = new Button("Two");
    Button b3 = new Button("Three");
    Button b4 = new Button("Four");
    Button b5 = new Button("Five");
    Button b6 = new Button("Six");
    
 
    public void init()
    {
        setLayout(fl);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
