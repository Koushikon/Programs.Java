import java.util.Scanner;
interface sport
{
	int year=2019;
	void display();
}
class person
{
	String name,address,phone;
	person(String nm,String add, String ph_no)
	{
		name=nm;
		address=add;
		phone=ph_no;
	}
	void display_info()
	{
		System.out.print("\nName :- "+name+"\nAddress :- "+address+"\nConatact_number :- "+phone);
	}
}
class cricket extends person implements sport
{
	int score;
	cricket(String nm, String add, String ph_no, int scr)
	{
		super(nm,add,ph_no);
		score=scr;
	}
	public void display()
	{
		System.out.print("\nYear :- "+year);
	}
	void display_info()
	{
		display();
		super.display_info();
		System.out.print("\nTotal Score :- "+score+"\n");
	}
}

class Interface_Class_EX
{
	public static void main(String []args)
	{
		cricket cr1=new cricket("Bob","Washington","7090025148",1921);
		cricket cr2=new cricket("Biscuit","Poland","7198451545",1500);
		
		System.out.print("\nPLAYERY DETAILS...\n");
		
		cr1.display_info();
		cr2.display_info();
	}
}