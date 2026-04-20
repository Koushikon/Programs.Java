import java.util.Scanner;
class leniersch
{
	public static void main(String args[])
	{
		Scanner bye=new Scanner(System.in);
		int n,item;
		int a[]=new int[20];
		
		System.out.print("Enter value for n: ");
		n=bye.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter value for A - ["+i+"] ");
			a[i]=bye.nextInt();
		}
		
		System.out.println("Enter the item you have searched - ");
		item=bye.nextInt();
		int x=0;
		for(int i=1;i<=n;i++)
		{
			if(item==a[i])
			{
				System.out.print("Search is sucessful at "+i+" position");
				x=1;
				break;
			}
		}
			if(x==0)
			{
				System.out.print("Search is unsucessful");
			}
		
	}
}