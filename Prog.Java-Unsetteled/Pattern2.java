class pattern2
{
	public static void main(String args[])
	{
		int n=8;
		System.out.println("Pattern :- \n");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*   ");
			}
			System.out.print("\n");
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*   ");
			}
			System.out.print("\n");
		}
	}
}