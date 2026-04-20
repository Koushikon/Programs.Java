//Student result program using multilavel nheritance... 
import java.util.Scanner;
class multi
{
	int roll;
	char name;
	Scanner bye=new Scanner(System.in);
	
	void input()
	{
		//System.out.print("Enter your name :- ");
		name='A';
		System.out.print("Enter your Roll No. :- ");
		roll=bye.nextInt();
	}
	void output()
	{
		System.out.println("\n\nName = "+name+"\nRoll = "+roll);
	}
}

class inherit extends multi
{
	
	double total=500,marks,per;
	Scanner ok=new Scanner(System.in);
	
	void in()
	{
		input();
		System.out.println("This exam marks is out of 500");
		//Condition lagate hoba 0 to 500 r modha jate input dey nahole errot messege.
		while(4<6)
		{
			System.out.print("Enter your total marks :- ");
			marks=ok.nextDouble();
			if(marks>0 && marks<=500)
				break;
		}
		per=marks*100/total;
		
	}
	void out()
	{
		output();
		System.out.println("Total Marks = "+marks+"\nPercentage = "+per+"%");
	}
}

class inheritance extends inherit
{
	void get()
	{
		in();
	}
	void put()
	{
		out();
		System.out.print("Grade = ");
		if(per>=95)
			System.out.print("A+");
		else
		{
			if(per>=75)
				System.out.print("A");
			else
			{
				if(per>=60)
					System.out.print("B");
				else
				{
					if(per>=35)
						System.out.print("C");
					else
						System.out.print("D");
				}
			}
		}
	}
}

class MultiResult
{
	public static void main(String args[])
	{
		inheritance oo=new inheritance();
		oo.get();
		oo.put();
	}
}
