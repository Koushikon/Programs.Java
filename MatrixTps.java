import java.util.Scanner;
class MatrixTps
{
	public static void main(String args[])
	{
		int n;
		int a[][]=new int[10][10];
		Scanner ali=new Scanner(System.in);
		
		System.out.print("Enter value for N. :- ");
		n=ali.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("Enter for A - ["+i+"]["+j+"] :- ");
				a[i][j]=ali.nextInt();
			}
		}
		
		System.out.println("After transpose matrix values are as follows...");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println(" ");
		}
		
		System.out.println("After transpos matrix values are as follows...");
		for(int j=1;j<=n;j++)
		{
			for(int i=1;i<=n;i++)
				System.out.print(a[i][j]+" ");
			System.out.println(" ");
		}
	}
}