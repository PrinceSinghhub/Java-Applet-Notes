import java.applet.*;
import java.awt.*;
public class Myapplet extends Applet
{
    TextArea ta1 = new TextArea("Welcome to GeekyShows", 20, 100);
    public void init()
    {
        add(ta1);
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
