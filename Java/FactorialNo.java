//Factorial with Getting User input using scanner
import java.util.Scanner;
class FactorialNo	
{
	public static void main(String ola[])
	{
		Scanner ali=new Scanner(System.in);
		int n,fact=1;
		
		System.out.print("Enter the value for N:- ");
		n=ali.nextInt();
		for(int i=2;i<=n;i++)
			fact=fact*i;
		System.out.println("Factorial :- "+fact);
	}
}