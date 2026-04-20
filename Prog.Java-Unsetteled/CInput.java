import java.util.Scanner;
class cinput
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		char c[]=new char[10];
		String s = "Hi!";
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter char :- ");
			c[i] = in.nextLine().charAt(0);
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println(c[i]);
		}
	}
}