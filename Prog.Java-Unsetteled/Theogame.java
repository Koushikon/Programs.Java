import java.util.Scanner;
interface sport
{
	int year=2019;
	void display();
}
class person
{
	String name,address,phone;
	int age;
	person(String nm,String add, int ag, String ph_no)
	{
		name=nm;
		address=add;
		age=ag;
		phone=ph_no;
	}
	void display_info()
	{
		System.out.print("\nName :- "+name+"\nAddress :- "+address+"\nAge"+age+"\nConatact_number :- "+phone);
	}
}
class cricket extends person implements sport
{
	int score=102,runs;
	String xper;  	//It's for Match performence...
	cricket(String nm,String add, int ag, String ph_no, String xp, int rn)
	{
		super(nm,add,ag,ph_no);
		xper=xp;
		runs=rn;
	}
	void cal()
	{
		score=score+runs;
	}
	public void display()
	{
		System.out.print("\nYear :- "+year);
	}
	void display_info()
	{
		super.display_info();
		System.out.print("\nPlayer Monthly XP :- "+xper+"\nTotal Score :- "+score);
	}
}

class Theogame
{
	public static void main(String []args)
	{
		Scanner ok=new Scanner(System.in);
		String w,x1,x2,y,p;		//w for name , x1 for player XP , x2 for address , p for phone_NO...
 		int z,y2;  		//z for scores achive , y2 for age...
		cricket cr=new cricket(String w, String x2, int y2, String p, String x1, int z);
		//cricket cr1=new cricket("Bob","Washington","7090025148",1921);
		//cricket cr2=new cricket("Biscuit","Poland","7198451545",1500);
		
		System.out.print("Sir, We accept only 5 persons record at a time...");
		
		System.out.print("Enter player name :- ");
		w=ok.nextLine();
		
		System.out.print("Enter player address :- ");
		x2=ok.nextLine();
		
		System.out.print("Enter age. :- ");
		y2=ok.nextInt();
		
		System.out.print("Enter contact no. :- ");
		p=ok.nextLine();
		
		System.out.print("Enter today performence out of 100 :- ");
		x1=ok.nextLine();
		
		System.out.print("Enter player score :- ");
		z=ok.nextInt();
		
		cr.display();
		cr.display_info();
	}
}