import java.util.Scanner;
class binarysch
{
	public static void main(String args[])
	{
		Scanner bye=new Scanner(System.in);
		int n,item,beg,mid,end;
		int a[]=new int[30];
		
		System.out.print("Enter value for n: ");
		n=bye.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter value for A - ["+i+"] ");
			a[i]=bye.nextInt();
		}
		
		System.out.println("Enter the item you have searched - ");
		item=bye.nextInt();
	        int x=0;
		beg=0;
		end=n-1;
		mid=(beg+end)/2;
		while(beg<=end)
		{
			if(a[mid]<item)
			beg=mid+1;
			else if(a[mid]==item)
			{
				System.out.println("Search is sucessful at "+mid+" position");
x=1;
break;
			}
			else
			end=mid-1;
			mid=(beg+end)/2;
		}
		if(x==0)
		System.out.print("Search is unsucessful");
	}
}