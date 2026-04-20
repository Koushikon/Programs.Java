//Write a program to put AWT events 
import java.awt.*;  
public class AWTEvents  
{  
    public static void main(String args[])
    {  
        Frame f= new Frame("AWT_&_Events");  
        
        //Choice List in java AWT
        Choice c=new Choice();  
        c.setBounds(50,75, 75,75);  
        c.add("# 1");  
        c.add("# 2");  
        c.add("# 3");  
        c.add("# 4");    
        f.add(c);  

        //Checkboxes in java AWT
        Checkbox CB1 = new Checkbox("C++");  
        CB1.setBounds(170,50, 50,50);  
        Checkbox CB2 = new Checkbox("Java", true);  
        CB2.setBounds(170,100, 50,50);  
        f.add(CB1);  
        f.add(CB2);

        //CheckboxGroup in java AWT
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox CBG1 = new Checkbox("C++", cbg,false);    
        CBG1.setBounds(250,50, 50,50);    
        Checkbox CBG2 = new Checkbox("Java", cbg,true);    
        CBG2.setBounds(250,100, 50,50);    
        f.add(CBG1);    
        f.add(CBG2);

        //Label in java AWT
        Label l1=new Label("First Label.");   
        l1.setBounds(50,150, 100,30);    
        f.add(l1);

        //TextField in java AWT
        TextField t1=new TextField("Welcome Bro");
        t1.setBounds(170,150, 100,30);    
        f.add(t1);

        //TextArea in java AWT
        TextArea area=new TextArea("What's Going On");  
        area.setBounds(50,200, 200,100);
        f.add(area);

        //Button in java AWT
        Button b=new Button("Click Here");  
        b.setBounds(275,225,80,30);  //Set Button Location & Size
        f.add(b);

        //List in java AWT
        List li1=new List(4);  
        li1.setBounds(275,275, 75,75);  
        li1.add("Item 1");  
        li1.add("Item 2");  
        li1.add("Item 3");  
        li1.add("Item 4");   
        f.add(li1);

        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
}                     