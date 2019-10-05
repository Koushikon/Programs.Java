interface one1
{
    static int a = 2020;
    void display();
}
abstract class two implements one1
{
    int age, b;
    String name;
    two()
    {}
    protected void display_info()
    {
        b=a+30;
        display();
        System.out.println("End on : "+b);
    }
}
class three extends two implements one1
{   
    long sal;
    three(String n, int ag, long s)
    {
        name = n;
        age = ag;
        sal=s;
    }
    public void display()
    {
        System.out.println("\n\t...Starting From 2020...");
    }
    protected void display_info()
    {
        super.display_info();
        System.out.println("Name : "+name+"\tAge : "+age+"\tSalary : "+sal);
    }
}
class Inter_to_Abst
{
    public static void main(String []args)
    {
        three th1 = new three("Roby",25,37000);
        three th2 = new three("Ujjal",22,45000);
        System.out.println("\tInterface to Abstract Program");
        th1.display_info();
        th2.display_info();  
    }
}