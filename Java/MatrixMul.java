import java.util.Scanner;
class MatrixMul
{
	public static void main(String args[])		//(https://matrix.reshish.com/multiplication.php) you can test right on this site...
	{
		Scanner ok=new Scanner(System.in);
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
		
		if(r1==c2 && r2==c1)
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
				for(int j=1;j<=c2;j++)
					c[i][j]=0;
			}
			
			for(int i=1;i<=r1;i++)
			{
				for(int j=1;j<=c1;j++)
				{
					for(int k=1;k<=c2;k++)
						c[i][k]=c[i][k]+a[i][j]*b[j][k];
				}
			}
			
			System.out.println("And the matrix result is as follows...");
			for(int i=1;i<=r1;i++)
			{
				for(int j=1;j<=c2;j++)
					System.out.print(c[i][j]+"   ");
				System.out.println(" ");
			}
		}
		else
			System.out.println("Matrix multiplication not possible due to differnent order ^_^ ");
	}
}