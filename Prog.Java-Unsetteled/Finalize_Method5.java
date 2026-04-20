class Finalize_Method5
{ 
    public static void main(String[] args) 
    { 
        Finalize_Method5 q = new Finalize_Method5(); 
        q = null; 
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    }
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
        System.out.println(10 / 0); 
    } 
}