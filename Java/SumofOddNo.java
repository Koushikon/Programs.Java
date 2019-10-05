class SumofOddNo
{
	public static void main(String args[])
		{
			int sum=0;
			for(int i=1;i<=10;i++)
				{
					System.out.print(i*2-1+"+");
					sum=sum+(i*2)-1;
				}
			System.out.print(" = "+sum);
		}
}