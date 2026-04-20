// Java program to illustrate the BorderLayout 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

// class extends JFrame 
class BLD extends JFrame { 

	BLD() 
	{ 
		
		// Creating Object of Jpanel class 
		JPanel pa = new JPanel(); 

		// set the layout 
		pa.setLayout(new BorderLayout()); 

		// add a new JButton with name "wel" and it is East, West, North, South, Center 
		pa.add(new JButton("NORTH"), BorderLayout.NORTH); 

		pa.add(new JButton("SOUTH"), BorderLayout.SOUTH); 
 
		pa.add(new JButton("EAST"), BorderLayout.EAST); 

		pa.add(new JButton("WEST"), BorderLayout.WEST); 
 
		pa.add(new JButton("Center"), BorderLayout.CENTER); 

		// add the pa object which refer to the Jpanel 
		add(pa); 

		// Function to close the operation of JFrame. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		// Function to set size of JFrame. 
		setSize(300, 300); 

		// Function to set visible status of JFrame. 
		setVisible(true); 
	} 
} 

class Border_Layout_Demos_1 { 

	// Driver code 
	public static void main(String[] args) 
	{ 
		
		// calling the constructor 
		new BLD(); 
	} 
} 
