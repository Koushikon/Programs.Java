class Shape
{
    double length;
    Shape(double l)
    {
        length=l;
    }
    void display()
    {
        System.out.println("\nLength = "+length);
    }
}
class Circle extends Shape
{
    double peri,area;
    Circle(double l)
    {
        super(l);
    }
    void calc()
    {
        peri=2*3.14*length;
        area=3.14*length*length;
    }
    void display()
    {
        super.display();
        System.out.println("Circle\nPeri = "+peri+"\nArea = "+area);
    }
}
class Square extends Shape
{
    double peri,area;
    Square(double l)
    {
        super(l);
    }
    void calc()
    {
        peri=4*length;
        area=length*length;
    }
    void display()
    {
        super.display();
        System.out.println("Square\nPeri = "+peri+"\nArea = "+area);
    }
}
class Shapes
{
    public static void main(String []args)
    {
        Circle c1= new Circle(3);
        Square s1= new Square(4.1);
        c1.calc();
        s1.calc();
        c1.display();
        s1.display();
    }
}