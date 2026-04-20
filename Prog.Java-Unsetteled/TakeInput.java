import java.io.DataInputStream;
class TakeInput
{
	public static void main(String ola[])
	{
		DataInputStream ali=new DataInputStream(System.in);
		int a,b,c;
		try
		{
			System.out.print("Enter value for A :- ");
			a=Integer.parseInt(ali.readLine());
			System.out.print("Enter value for B :- ");
			b=Integer.parseInt(ali.readLine());
			c=a-b;
			System.out.println("The substraction value is :- "+c);
		}
		catch(Exception pour)
		{
			System.out.println("Not Catched");
		}
	}
}