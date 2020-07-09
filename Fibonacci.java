class Fibonacci
{
	public static void main(String args[])
		{
		int sum,n=10,a=0,b=1;
		for(int i=1;i<=n;i++)
			{
			System.out.print(a+"+");
			sum=a+b;
			a=b;
			b=sum;
			}
		System.out.print("\b ="+b);
		}
}