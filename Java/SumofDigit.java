class SumofDigit
{
	public static void main(String args[])
	{
		int n=273,sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n=n/10;
		}
		System.out.print("Sum of digits = "+sum);
	}
}