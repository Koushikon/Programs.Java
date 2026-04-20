class Final_Variable
{
    // Non final variable
    int a = 5;
    // final variable 
    final int b= 7;

    public static void main(String[] args) 
    { 
        Final_Variable clss = new Final_Variable();
        clss.display(20);
    }

    void display(int a)
    {
        // modifying non final variable : Allowed
        a++;

        // modifying final variable : Immediately gives you Compile Time error
        //b++;

        System.out.println(this.a+" Then "+a+"\nB Value "+b);
    }
} 