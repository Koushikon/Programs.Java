class indra
{
public static void main(String args[])
{
int k,sum=0,t,i=0,j=1;
for(k=0;k<10;k++)
{
System.out.print(i+" + ");
sum=sum+i;
t=i+j;
i=j;
j=t;
}
System.out.println("\b\b ="+sum);
}
}