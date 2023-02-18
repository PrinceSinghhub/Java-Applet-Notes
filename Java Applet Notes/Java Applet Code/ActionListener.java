import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Myapplet extends Applet implements ActionListener  
{
    Button b1 = new Button("Click Me"); 
    String str="";
    public void init()
    {
        add(b1);
        b1.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(str, 20, 50);
    }
    public void actionPerformed(ActionEvent e)
    {
        str = "Button Cliked";
        repaint();
    }
}

// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>

