//Getting user input in an array using scanner
import java.util.Scanner;
class ArrayIntro
{
	public static void main(String args[])
	{
		Scanner ok=new Scanner(System.in);
		int n;
		int a[]=new int[20];
		
		System.out.print("Enter value for n: ");
		n=ok.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter value for A - ["+i+"] ");
			a[i]=ok.nextInt();
		}
		
		System.out.println("The array values are as follows :- ");
		for(int i=1;i<=n;i++)
			System.out.print(a[i]+" ");
	}
}