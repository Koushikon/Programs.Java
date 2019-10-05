class Leapyear   //Check years is leap year or not
{
	public static void main(String args[])
		{
			int year=2019,source;
			source=year;
			if(year%100==0)
				year=year/100;
			else
				year=year%100;
			if(year%4==0)
				System.out.print(source+" - is a leap year");
			else
				System.out.print(source+" - is not a leap year");
		}
}