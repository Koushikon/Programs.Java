//This Package Program here in Shape folder Using shape2d.class this program will run...

import shape.shape2d;
import java.util.Scanner;
class Shapefiles
{
	public static void main(String[] args)
	{
		int i1,i2,x;
		double y;
		shape2d SH=new shape2d();
		Scanner SN=new Scanner(System.in);
		
		System.out.print("\nEnter 1'st No :- ");
		i1=SN.nextInt();
		System.out.print("\nEnter 2'nd No :- ");
		i2=SN.nextInt();
		
		
		x=SH.rectarea(i1,i2);
		System.out.println("Area of rectangle is - "+x);
		x=SH.rectperi(i1,i2);
		System.out.println("Parameter of rectangle is - "+x);
		x=SH.sqararea(i1);
		System.out.println("Area of square is - "+x);
		x=SH.sqarperi(i1);
		System.out.println("Parameter of square is - "+x);
		y=SH.circarea(i1);
		System.out.println("Area of circle is - "+y);
		y=SH.circperi(i1);
		System.out.println("Parameter of circle is - "+y);
	}
}