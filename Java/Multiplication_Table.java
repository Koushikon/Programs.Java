class Multiplication_Table
{
	public static void main(String args[])
	{
		int n=8;
		System.out.println("Here's "+n+"th multiplication table.\n");
		for(int i=1;i<=10;i++)
			System.out.print("  "+n);
		System.out.print("\n");
		for(int i=1;i<=10;i++)
			System.out.print("  "+i);
		System.out.print("\n");
		for(int i=1;i<=10;i++)
			System.out.print(" "+n*i);
	}
}