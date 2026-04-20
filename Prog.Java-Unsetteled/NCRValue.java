import java.util.Scanner;
class factorial
{
	int fact(int n)
	{
		int fact=1;
		for(int i=2;i<=n;i++)
			fact=fact*i;
		return(fact);
	}
}
class NCRValue
{
	public static void main(String []args)
	{
		int n,r,ncr;
		factorial f=new factorial();
		Scanner S=new Scanner(System.in);
		
		System.out.print("\nEnter value for N :- ");
		n=S.nextInt();
		System.out.print("\nEnter value for R :- ");
		r=S.nextInt();
		
		ncr=f.fact(n)/(f.fact(r)*f.fact(n-r));
		System.out.println(n+"C"+r+" = "+ncr);
	}
}