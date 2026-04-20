class A
{
    int i = 50;
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("From Finalize Method");
    }
}
public class Finalize_Method2
{
   public static void main(String[] args)
   {
      //Creating two instances of class A
    A a1 = new A();
    A a2 = new A();
    
    //Assigning a2 to a1
    a1 = a2;
 
    //Making finalize() method to execute forcefully
    Runtime.getRuntime().runFinalization();
    System.out.println("Done...");
   }
}