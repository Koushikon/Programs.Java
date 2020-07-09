//This programme explain how multi threading works in java...
class one extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(":i - "+i);
		}
	}
}
class two extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(":i*i - "+i*i);
		}
	}
}
class three extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(":i*i*i - "+i*i*i);
		}
	}
}
class MultiThread
{
	public static void main(String args[])
	{
		one a=new one();
		two b=new two();
		three c=new three();
		a.start();
		b.start();
		c.start();
		//a.run();
		//b.run();
		//c.run();
	}
}