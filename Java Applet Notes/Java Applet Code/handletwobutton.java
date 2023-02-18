import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Myapplet extends Applet implements ActionListener  
{
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");
    String str=" ";
    public void init()
    {
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void paint(Graphics g)
    {
        g.drawString(str, 20, 50);
    }
    public void actionPerformed(ActionEvent e)
    {
        String st = e.getActionCommand();
        if(st.equals("OK"))
        {
            str = "OK Clicked";
        }
        if(st.equals("Cancel"))
        {
            str = "Cancel Clicked";
        }
        repaint();
    }
}


// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
