import java.awt.event.*;
import java.awt.*;
class Event_Handl_EX extends Frame implements ActionListener
  {
    TextField txtfld;
    Event_Handl_EX()
      {
        txtfld= new TextField();
        txtfld.setBounds(65,60,190,20);
        Button bt=new Button("Click me");
        bt.setBounds(100,120,80,30);
        bt.addActionListener(this);
        add(bt);add(txtfld);
        setSize(350,350);
        setLayout(null);
        setVisible(true);
      }
    public void actionPerformed(ActionEvent e)
      {
        txtfld.setText("welcome 2 c-sharpcorner.com");
      }
    public static void main(String args[])
      {
        new Event_Handl_EX();
      }
  }