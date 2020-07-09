class Square
{
	public static void main(String args[])
		{
		int sum=0;
		for(int i=1;i<=10;i++)
			{
			System.out.print(i*i+"+");
			sum=sum+i*i;
			}
		System.out.print("\b ="+sum);
		}
}