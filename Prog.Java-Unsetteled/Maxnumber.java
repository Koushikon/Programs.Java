class maxn
{
	public int max(int a, int b)
	{
		return(a>b?a:b);
	}
}
class Maxnumber
{
	public static void main(String []args)
	{
		maxn m=new maxn();
		int a=56,b=34,c=7,d=72,e=32,maxi;
		System.out.print("\n 1st = "+a+"\t 2nd = "+b+"\t 3rd = "+c+"\t 4th = "+d+"\t 5th = "+e);
		maxi=m.max(a,m.max(b,m.max(c,m.max(d,e))));
		System.out.print("\n Maximum value = "+maxi);
	}
}