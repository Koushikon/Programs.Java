package Shape;
public class shape2d
{
	public int rectarea(int a,int b)
	{
		return(a*b);
	}
	public int rectperi(int a,int b)
	{
		return(2*(a+b));
	}
	public int sqararea(int a)
	{
		return(a*a);
	}
	public int sqarperi(int a)
	{
		return(4*a);
	}
	public double circarea(int r)
	{
		return(3.14*(r*r));
	}
	public double circperi(int r)
	{
		return(3.14*(2*r));
	}
}