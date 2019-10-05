//Question Paper Solve
//Using Abstract Class

abstract class Student
{
	final int age=22;
	String programme,name;

	Student()
	{}

	void display_student_info()
	{}
}
class Graduate_student extends Student
{
	double per;
	String stream;

	Graduate_student(String pro, String n, double p, String s)
	{
		//age=a;
		programme=pro;
		name=n;
		per=p;
		stream=s;
	}

	void display_student_info()
	{
		System.out.print("\nName :- "+name+"\nAge :- "+age+"\nProgramme :- "+programme+"\n% Marks in 12th :- "+per+"%\nStream :- "+stream+"\n");
	}
}
class Research_student extends Student
{
	String specialisation;
	int years_of_experience;

	Research_student(String pro, String n,String sp, int yoe)
	{
		//age=a;
		programme=pro;
		name=n;
		specialisation=sp;
		years_of_experience=yoe;
	}

	void display_student_info()
	{
		System.out.print("\nName :- "+name+"\nAge :- "+age+"\nProgramme :- "+programme+"\nSpecialisation :- "+specialisation+
		"\nYears of experience :- "+years_of_experience+"\n");
	}

}
class Prouniversity2
{
	public static void main(String []args)
	{
		Graduate_student gs=new Graduate_student("BCA","Ashok",67,"Arts");
		Graduate_student gs1=new Graduate_student("BBA","Alan",81,"Science");
		Research_student rs=new Research_student("Security","Akash","Cyber Security",2);
		Research_student rs1=new Research_student("Human Behavior","Nila","Sociopath",1);
		gs.display_student_info();
		gs1.display_student_info();
		rs.display_student_info();
		rs1.display_student_info();
	}
}
