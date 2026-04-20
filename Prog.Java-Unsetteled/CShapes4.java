import java.awt.*;
import java.applet.*;
public class CShapes4 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.PINK);
		g.fillRect(50,50,340,220);
		g.setColor(Color.BLACK);
		g.fillRect(60,60,320,200);
		g.drawRect(55,55,330,210);
		
		g.setColor(Color.WHITE);
		g.drawLine(60,160,380,160);
		g.drawRect(60,60,160,200);
		g.drawRect(220,60,160,200);
		
		g.drawRect(65,65,150,90);
		g.drawRect(225,65,150,90);
		g.drawRect(65,165,150,90);
		g.drawRect(225,165,150,90);
		
		g.setColor(Color.YELLOW);
		g.fillRect(70,70,140,80);
		g.setColor(Color.RED);
		g.fillRect(230,70,140,80);
		g.setColor(Color.GREEN);
		g.fillRect(70,170,140,80);
		g.setColor(Color.BLUE);
		g.fillRect(230,170,140,80);
		
		g.setColor(Color.GRAY);
		g.fillRect(165,105,110,110);
		
		g.setColor(Color.WHITE);
		g.drawRect(165,105,110,110);
		g.drawRect(170,110,100,100);
	}
}