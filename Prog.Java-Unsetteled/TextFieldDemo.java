//Demonstrate text fields...
import java.awt.*;
import java.awi.event.*;
public class TextFieldDemo extends Frame implements ActionListener
{
	TextField name,pass,captcha;
	public TextFieldDemo()
	{
		//Use a flow layout...
		setLayout(new FlowLayout());
		
		//Create Controls...
		Label lname=new Label("Name :- ",Label.RIGHT);
		Label lpass=new Label("Password :- ",Label.LEFT);
		Label lcaptcha=new Label("Captcha (7 x 2 = ?) :- ",Label.RIGHT);
		name=new TextField(15);
		pass=new TextField(10);
		pass.setEchoChar('#');
		captcha=new TextField(3);
		
		//Add the controls to the frame...
		add(lname);
		add(name);
		add(lpass);
		add(pass);
		add(lcaptcha);
		add(captcha);
		
		//Add action event handlers...
		name.addActionListener(this);
		pass.addActionListener(this);
		captcha.addActionListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	//User pressed Enter...
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Name : "+name.getText(),20,100);
		g.drawString("Selected text in name : "+name.getSelectedText(),20,120);
		g.drawString("Password : "+pass.getText(),20,140);
		g.drawString("Captcha : "+captcha.getText(),20,160);
	}
	
	public static void main(String []args)
	{
		TextFieldDemo tfd=new TextFieldDemo();
		
		tfd.setSize(new Dimension(380,200));
		tfd.setTitle("Text File Demo");
		tfd.setVisible(true);
	}
}