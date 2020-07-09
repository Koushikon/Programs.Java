import java.util.Scanner;
class SCalculator
{
	public static void main(String[] hii)
	{
		int a,b,c=0,ch;
		Scanner ok=new Scanner(System.in);
		
		System.out.println("The simple calculator program...\n.\n.\n.\n   ^_^\n");
		System.out.print("Enter 1st No. :- ");
		a=ok.nextInt();
		System.out.print("Enter 2nd No. :- ");
		b=ok.nextInt();
		
		System.out.print("\n \t Press '1' for Addition\n \t Press '2' for Substruction\n \t Press '3' for Multiplication\n \t Press '4' for Division\n \t Press '5' for Modulation\n \t Please enter your choice... ");
		ch=ok.nextInt();
		switch(ch)
		{
			case 1:c=a+b;break;
			case 2:c=a-b;break;
			case 3:c=a*b;break;
			case 4:c=a/b;break;//condition dite chai sobsomoy choto number diya boro number ke bag korbo
			case 5:c=a%b;break;//atao kaj korcha na
			default:System.out.print("Invalid Choice");
		}
		System.out.println("\tAnd the value is : ^_^  "+c);
	}
}