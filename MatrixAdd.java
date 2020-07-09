import java.util.Scanner;
class MatrixAdd
{
	public static void main(String args[])
	{
		Scanner ok =new Scanner(System.in);
		int r1,c1,r2,c2;
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		
		//All matrices row and column number...
		
		System.out.print("Matrix-1 : Enter Row :- ");
		r1=ok.nextInt();
		
		System.out.print("Matrix-1 : Enter Column :- ");
		c1=ok.nextInt();
		
		System.out.print("Matrix-2 : Enter Row :- ");
		r2=ok.nextInt();
		
		System.out.print("Matrix-2 : Enter Column :- ");
		c2=ok.nextInt();
		
		//Take array input via above variables if that condition was satisfied...
		
		if(r1==r2 && c1==c2)
		{
			for(int i=1;i<=r1;i++)
			{
				for(int j=1;j<=c1;j++)
				{
					System.out.print("Enter values for A ["+i+"]["+j+"] :- ");
					a[i][j]=ok.nextInt();
				}
			}
			
			for(int i=1;i<=r2;i++)
			{
				for(int j=1;j<=c2;j++)
				{
					System.out.print("Enter values for B ["+i+"]["+j+"] :- ");
					b[i][j]=ok.nextInt();
				}
			}
			
			for(int i=1;i<=r1;i++)
			{
				for(int j=1;j<=c1;j++)
					c[i][j]=a[i][j]+b[i][j];
			}
			
			System.out.println("And the matrix result is as follows...");
			for(int i=1;i<=r2;i++)
			{
				for(int j=1;j<=c2;j++)
					System.out.print("\t"+c[i][j]+"  ");
				System.out.println("\n");
			}
		}
		else
			System.out.println("Matrix addition not possible due to differnent order ^_^ ");
	}
}