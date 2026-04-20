class A
{
    int i = 50;
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
public class Finalize_Method1
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
    A a1 = new A();
    A a2 = new A();
    a1.finalize();
    //Assigning a2 to a1
    a1 = a2;
 
    //Now both a1 and a2 will be pointing to same object
    //An object earlier referred by a1 will become abandoned
    System.out.println("Done...");
   }
}