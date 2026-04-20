class bha
{
public static void main(String args[])
{
int i,sum=0,n,m;
n=Integer.parseInt(args[0]);
m=Integer.parseInt(args[1]);
for (i=1;i<=n*m;i++)
{
sum=sum+i;
System.out.print(i+ " + ");
}
System.out.print("\b\b="+sum);
}
}