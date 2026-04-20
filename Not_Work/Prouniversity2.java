abstract class Student
{
	int age;
	String programme,name;

	Student()
	{}

	void display_student_info()
	{}
}
class Graduate_student extends Student
{
	float per;
	String stream;

	Graduate_student(int a, String pro, String n, float p, String s)
	{
		age=a;
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

	Research_student(int a,String pro, String n,String sp, int yoe)
	{
		age=a;
		programme=pro;
		name=n;
		specialisation=sp;
		years_of_experience=yoe;
	}

	void display_student_info()
	{
		System.out.print("\nName :- "+name+"\nAge :- "+age+"\nProgramme :- "+programme+"\nSpecialisation :- "+specialisation+"\nYears of experience :- "+years_of_experience+"\n");
	}

}
class Prouniversity2
{
	public static void main(String []args)
	{
		Graduate_student gs=new Graduate_student(17,"BCA","Ashok",67,"Arts");
		Graduate_student gs1=new Graduate_student(21,"BBA","Alan",81,"Science");
		Research_student rs=new Research_student(23,"Security","Akash","Cyber Security",2);
		Research_student rs1=new Research_student(23,"Human Behavior","Nila","Sociopath",1);
		gs.display_student_info();
		gs1.display_student_info();
		rs.display_student_info();
		rs1.display_student_info();
	}
}
