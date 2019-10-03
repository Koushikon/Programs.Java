class ArmstrongList
{
	public static void main(String args[])
	{
		int a,b=0,s;
		System.out.println("The Armstrong Nnumbers:- ");
		for(int n=1;n<=999;n++)
		{
		b=0;
			s=n;
			while(s>0)
			{
				a=s%10;
				b=b+a*a*a;
				s=s/10;
			}
			if(b==n)
				System.out.print("  "+n);
		}
	}
}