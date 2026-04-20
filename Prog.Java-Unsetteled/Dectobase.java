import java.util.Scanner;
class DB
{
	int no,b,k=1,n;
	Scanner om=new Scanner(System.in);
	void input()
	{
		System.out.print("Enter a number :- ");
		no=om.nextInt();
		System.out.print("Enter the base :- ");
		b=om.nextInt();
	}
	void cal()
	{
		n=no;
		while(n>=b)
		{
			k=k*b;
			n=n/b;
		}
		while(k>0)
		{
			n=no/k;
			switch(n)
			{
				case 10:System.out.print("A");break;
				case 11:System.out.print("B");break;
				case 12:System.out.print("C");break;
				case 13:System.out.print("D");break;
				case 14:System.out.print("E");break;
				case 15:System.out.print("F");break;
				default:System.out.print(n+" ");
			}
			no=no%k;
			k=k/b;
		}
	}
}
class Dectobase
{
	public static void main(String []args)
	{
		DB d=new DB();
		d.input();
		d.cal();
	}
}