import Facts.NCRPack;
import java.util.Scanner;
class NCRPFile
{
	public static void main(String []args)
	{
		int n,r,ncr;
		NCRPack f=new NCRPack();
		Scanner S=new Scanner(System.in);
		
		System.out.print("\nEnter value for N :- ");
		n=S.nextInt();
		System.out.print("\nEnter value for R :- ");
		r=S.nextInt();
		
		ncr=f.fact(n)/(f.fact(r)*f.fact(n-r));
		System.out.println(n+"C"+r+" = "+ncr);
	}
}