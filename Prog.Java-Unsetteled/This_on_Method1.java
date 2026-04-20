class TOM
{
    int rate,ammount,interest;

    TOM(int r, int a)
    {
        rate=r;
        ammount=a;
    }
    void interest()
    {
        int rate=5;
        rate=this.rate+rate;
        interest=rate*ammount/100;
        System.out.println("\nTotal Interest On Ammont "+ammount+" is : "+interest);
    }
}
class This_on_Method1
{
    public static void main(String []args)
    {
        TOM t=new TOM(1,5000); 
        t.interest();
    }
}
