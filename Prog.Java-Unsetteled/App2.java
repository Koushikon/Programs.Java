package bsbg;
import java.lang.String;
import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.applet.*;
import java.awt.Graphics;

public class App2 extends Applet 
{

    public void init()
	{
        String[] bsbg1;
        String[] bsbg2;
        String[] bsbg3;
        String[] bsbg4;

        String [][] name1 = {{"Black"}, {"Screen"}, {"British"}, {"Guy"}};
        String [][] name2 = {{"Black"}, {"Screen"}, {"British"}, {"Guy"}};
        String [][] name3 = {{"Black"}, {"Screen"}, {"British"}, {"Guy"}};
        String [][] name4 = {{"Black"}, {"Screen"}, {"British"}, {"Guy"}};

        Random rand = new Random();

        bsbg1 = name1 [rand.nextInt(name1.length)];
        bsbg2 = name2 [rand.nextInt(name2.length)];
        bsbg3 = name3 [rand.nextInt(name3.length)];
        bsbg4 = name4 [rand.nextInt(name4.length)];
			
		System.out.print(Arrays.toString(bsbg1));
        System.out.print(Arrays.toString(bsbg2));
        System.out.print(Arrays.toString(bsbg3));
        System.out.print(Arrays.toString(bsbg4));
    }

    public void stop()
	{
    }

    public void paint(Graphics g)
	{

        g.drawString((Arrays.toString(bsbg1)), 150, 50);

        g.drawString((Arrays.toString(bsbg2)), 150, 50);

        g.drawString((Arrays.toString(bsbg3)), 175, 50);

        g.drawString((Arrays.toString(bsbg4)), 200, 50);
    }

}