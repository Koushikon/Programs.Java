//Demonstrate check boxes...
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Checkboxdemo extends Applet implements ItemListener
{
	String msg="";
	Checkbox win_xp, win_7, win_10, kali_linux, mac_os;
	public void init()
	{
		GridBagLayout gbag=new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		setLayout(gbag);
		
		//Create check boxes...
		win_xp=new Checkbox("Windows XP");
		win_7=new Checkbox("Windows 7");
		win_10=new Checkbox("Windows 10",null,true);
		kali_linux=new Checkbox("Kali Linux");
		mac_os=new Checkbox("Mac OS");
		
		//Add the check boxes to the frame...
		add(win_xp);
		add(win_7);
		add(win_10);
		add(kali_linux);
		add(mac_os);
		
		//Add item listeners...
		win_xp.addItemListener(this);
		win_7.addItemListener(this);
		win_10.addItemListener(this);
		kali_linux.addItemListener(this);
		mac_os.addItemListener(this);
	}
	
	//Repaint when status of the check box changes...
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	//Display current state of the check boxes...
	public void paint(Graphics g)
	{
		msg="Current status of your operating system...";
		g.drawString(msg,50,80);
		msg="Windows XP = "+win_xp.getState();
		g.drawString(msg,50,100);
		msg="Windows 7 = "+win_7.getState();
		g.drawString(msg,50,120);
		msg="Windows 10 = "+win_10.getState();
		g.drawString(msg,50,140);
		msg="Kali Linux = "+kali_linux.getState();
		g.drawString(msg,50,160);
		msg="Mac OS = "+mac_os.getState();
		g.drawString(msg,50,180);
		
	}
}