class SumNNo
{
public static void main(String args[])
	{
	int sum=0;
	for(int i=1;i<=20;i++)
		{
		System.out.print(i+"+");
		sum=sum+i;
		}
	System.out.print("\b ="+sum);
	}
}