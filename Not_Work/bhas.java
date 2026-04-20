class bhas
{
public static void main(String args[])
{
int sum=0,i;
for(i=1;i<=10;i++)
{
sum=sum+i*2-1;
System.out.print(i*2-1+" + ");
}
System.out.println("\b\b="+sum);
}
}