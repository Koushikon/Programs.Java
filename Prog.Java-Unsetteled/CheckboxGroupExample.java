import java.awt.*;    
public class CheckboxGroupExample    
{    
    public static void main(String args[])    
    {    
        Frame f= new Frame("CheckboxGroup Example");    
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox CB1 = new Checkbox("C++", cbg,false);    
        CB1.setBounds(100,100, 50,50);    
        Checkbox CB2 = new Checkbox("Java", cbg,true);    
        CB2.setBounds(100,150, 50,50);    
        f.add(CB1);    
        f.add(CB2);    
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
    }    
}