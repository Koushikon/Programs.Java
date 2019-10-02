abstract class graduate_stu
{
    String fname;
    void display()
    {}
}
abstract class research_stu
{
    String lname;
    void display()
    {}
}
class Student extends graduate_stu
{
    Student(String fn)
    {
        fname=fn;
    }
    void display()
    {
        System.out.print("Full_Name: "+fname);
    }
}
class Dtudent extends research_stu
{
    Dtudent(String ln)
    {
        lname=ln;
    }
    void display()
    {
        System.out.print(" "+lname);
    }
}
class Abstract_Test
{
    public static void main(String []args)
    {
        Student s=new Student("Biren");
        Dtudent d=new Dtudent("Goswami");
        s.display();
        d.display();
    }
}