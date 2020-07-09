class Calculation_Series
{
	public static void main(String args[])
	{
		int sum=0,j=1;
		for(int i=1;i<=11;i++)
		{
			if(i%2==0)
			{
				System.out.print(j+"+");
				sum=sum-j;
			}
			else
			{
				System.out.print(j+"-");
				sum=sum+j;
			}
		j=j*2;
		}
	System.out.print("\n\tSum = "+sum);
	}
}