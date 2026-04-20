import java.util.Scanner;
class bubblesort
{
	public static void main(String args[])
	{
		Scanner ok=new Scanner(System.in);
		int n,t;
		int a[]=new int[20];
		System.out.print("Enter value for n: ");
		n=ok.nextInt();
			
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for A - ["+i+"] ");
			a[i]=ok.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}	
		System.out.println("The array values are as follows :- ");
		for(int i=0;i<n;i++)
		System.out.print(a[i]+"  ");
	}
}