import java.util.Scanner;
class prime
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n,s;
System.out.print("\nEnter The Number...");
n=in.nextInt();
s=(int)Math.sqrt(n);
for(int i=2;i<=s;i++)
{
if(n%i==0)
{
System.out.print("\n"+n+" is NOT Prime!!!\n and is divisible by "+i);
return;
}

}
System.out.print("\n"+n+" is Prime!!!");


}


}