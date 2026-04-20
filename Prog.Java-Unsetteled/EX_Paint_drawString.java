import java.awt.*;
import java.applet.*;

public class EX_Paint_drawString extends Applet
{
    String str ="";

    public void init()
    {
        str="init-";
    }

    public void start()
    {
        str=str+"start-";
    }

    public void stop()
    {
        str=str+"stop-";	
    }
n
    public void paint(Graphics g)
    {
        str=str+"paint-";
        g.drawString(str,40,100);
        g.drawString("Hello from the Applet.", 40,40);
        g.drawString("How are you doing?", 40, 60);
        g.drawString("We wish you a pleasant day today.", 40, 80);
    }

}