class This_on_Constructor
{
    This_on_Constructor() 
    {
		this("This_on_Constuctor");
		System.out.println("Inside Constructor without parameter");
	}
    This_on_Constructor(String str) 
    {
		System.out.println("Inside Constructor with String parameter as " + str);
	}
    public static void main(String[] args)
    {
        This_on_Constructor obj = new This_on_Constructor();
	}
}