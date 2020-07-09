class LcmGcd
{
	public static void main(String args[])
		{
			long a=90,b=80,lcm,gcd;
			lcm=a*b;
			while(a!=b)
				{
					if(a>b)
						a=a-b;
					else
						b=b-a;
				}
			gcd=a;
			System.out.println("LCM = "+lcm/gcd);
			System.out.println("GCD = "+gcd);
		}
}