//Question Paper Solve
//Using Super Keyword

class Student
{
	int age;
	String name,programme;
	Student(int a,String n,String pro)
	{
		age=a;
		name=n;
		programme=pro;
	}
	void display_student_info()
	{
		System.out.print("\nAge :- "+age+"\nName :- "+name+"\nProgramme :- "+programme);
	}
}
class Graduate_student extends Student
{
	double per;
	String stream;

	Graduate_student(int a,String n,String pro, double p, String s)
	{
		super(a,n,pro);
		per=p;
		stream=s;
	}
	void display_student_info()
	{
		super.display_student_info();
		System.out.print("\nPercentage of marks in 12th :- "+per+"\nStream :- "+stream+"\n");
	}
}

class Research_student extends Student
{
	String specialisation;
	int years_of_experience;

	Research_student(int a,String n,String pro, String sp, int yoe)
	{
		super(a,n,pro);
		specialisation=sp;
		years_of_experience=yoe;
	}
	void display_student_info()
	{
		super.display_student_info();
		System.out.print("\nSpecialisation :- "+specialisation+"\nYears of working experience :- "+years_of_experience+"\n");
	}
}
class Prouniversity
{
	public static void main(String[] args)
	{
		Graduate_student gs=new Graduate_student(22,"Akash","MCA",67,"Arts");
		Graduate_student gs1=new Graduate_student(23,"Akhil","BCA",49,"Commerce");
		Research_student rs=new Research_student(24,"Bikram","Security","Cyber Security",2);
		Research_student rs1=new Research_student(26,"Anil","Human Behavior","Sociopath",4);
		Student s=new Student(24,"Bren","BBA");
		gs.display_student_info();
		gs1.display_student_info();
		rs.display_student_info();
		rs1.display_student_info();
		s.display_student_info();
	}
}
