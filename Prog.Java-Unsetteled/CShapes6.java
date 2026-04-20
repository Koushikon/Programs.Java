import java.awt.*;
import java.applet.*;
public class CShapes6 extends Applet
{
	public void paint(Graphics f)
	{
		f.setColor(Color.PINK);
		f.fillRect(60,10,250,50);
		f.fillRect(260,60,50,250);
		f.fillRect(10,260,250,50);
		f.fillRect(10,10,50,250);
		
		f.fillOval(135,135,50,50);
		
		f.setColor(Color.RED);
		f.fillRect(70,70,115,60);
		f.setColor(Color.GREEN);
		f.fillRect(190,70,60,115);
		f.setColor(Color.BLUE);
		f.fillRect(135,190,115,60);
		f.setColor(Color.YELLOW);
		f.fillRect(70,135,60,115);
		
		f.setColor(Color.BLACK);	
		f.drawRect(10,10,300,300);
		f.drawRect(60,60,200,200);
		
		f.drawRect(70,70,115,60);
		f.drawRect(190,70,60,115);
		f.drawRect(135,190,115,60);
		f.drawRect(70,135,60,115);
		
		f.drawOval(135,135,50,50);
	}
}