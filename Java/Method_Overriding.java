// A Simple Java program to demonstrate  
// method overriding in java 
  
// Base Class 
class Parent 
{ 

    public void show(int a, int b) 
    {
        int sum=a+b;
        System.out.println("\nMother Calling..."+sum+" times\n");
    } 
} 
  
// Inherited class 
class Child extends Parent 
{ 

    public void show(double d, double e)
    {    //Method Overriding...
        double sum=d+e;
        System.out.println("Son Calling..."+sum/2+" times\n");
    } 
} 
  
// Driver class 
class Method_Overriding 
{ 
    public static void main(String[] args) 
    { 

        Parent obj1 = new Parent(); 
        Child obj2 = new Child();

        obj1.show(2,8);  
        obj2.show(2.3,7.7);  
    } 
}