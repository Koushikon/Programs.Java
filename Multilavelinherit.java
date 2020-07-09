//Student result program using multilavel inheritance...
import java.util.Scanner;
class mit
{
	int a,b;
	Scanner bye=new Scanner(System.in);

	void input()
	{
		System.out.print("Enter for A :- ");
		a=bye.nextInt();
		System.out.print("Enter for B :- ");
		b=bye.nextInt();
	}
	void output()
	{
		System.out.println("A = "+a+", B = "+b);
	}
}
class abc extends mit
{
	int c,d;
	Scanner ok=new Scanner(System.in);

	void in()
	{
		input();
		System.out.print("Enter for C :- ");
		c=ok.nextInt();
		System.out.print("Enter for D :- ");
		d=ok.nextInt();
	}
	void out()
	{
		output();
		System.out.println("C =  "+c+", D = "+d);
	}
}
class def extends abc
{
	float value;
	Scanner ali=new Scanner(System.in);
	void get()
	{
		in();
		System.out.print("Enter float value :- ");
		value=ali.nextFloat();
	}
	void put()
	{
		out();
		System.out.println("Value = "+value);
	}
}
class Multilavelinherit
{
	public static void main(String[] args)
	{
		def oo=new def();
		oo.get();
		oo.put();
	}
}
