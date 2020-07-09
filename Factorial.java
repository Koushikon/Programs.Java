//Factorial Numbers Without User-Input It's Predefined
class Factorial 
{
	public static void main(String args[])
	{
		int n=6;
		long f=1;
		for(int i=2;i<=n;i++)
			{
			f=f*i;
			}
		System.out.print("\nFactorial= "+f);
	}
}