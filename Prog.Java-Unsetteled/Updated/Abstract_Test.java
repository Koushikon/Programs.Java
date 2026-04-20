abstract class graduate_student
{
    String fname;
    void display()
    {}
}
abstract class research_student
{
    String lname;
    void display()
    {}
}
class student extends graduate_student
{
    graduate_student(String fn)
    {
        fname=fn;
    }
    void display()
    {
        System.out.println("Fname: "+fname);
    }
}
class dtudent extends research_student
{
    graduate_student(String ln)
    {
        lname=ln;
    }
    void display()
    {
        System.out.println("Lname: "+lname);
    }
}
class Abstruct_Test
{
    public static void main(String []args)
    {
        student s=new student("biren");
        dtudent d=new dtudent("biren");
        s.display();
        d.display();
    }
}