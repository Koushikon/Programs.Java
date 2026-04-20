class BinaryPattern
{
	public static void main(String args[])
	{
		int n=6,i,j;
		System.out.print("Binary Pattern :- \n");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n||i==j||i+j==n+1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.print("\n");
		}
	}
}