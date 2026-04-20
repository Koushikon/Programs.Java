import java.awt.*;
import java.applet.*;
public class CShapes3 extends Applet
{
	public void paint(Graphics g)
	{
		//Below two lines create a line in green color...
		g.setColor(Color.GREEN);
		g.drawLine(5,30,350,30);
		//Below three line create 2 rectangles side by side one with blue border and other is filled by blue color...	
		g.setColor(Color.BLUE);
		g.drawRect(5,40,90,55);
		g.fillRect(100,40,90,55);
		//Below two lines wll draw a filled rounded rectangle with color yelow...
		g.setColor(Color.YELLOW);
		g.drawRoundRect(195,40,90,55,50,50);
		//Below two lines will draw a rounded figure rectangle with color Pink...
		g.setColor(Color.PINK);
		g.fillRoundRect(290,40,90,55,20,30);
		//Below three lines will draw oval shape with color magenta...
		g.setColor(Color.MAGENTA);
		g.drawOval(300,100,90,90);
		g.fillOval(400,100,90,55);
	}
}