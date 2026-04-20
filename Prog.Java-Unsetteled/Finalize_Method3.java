class Finalize_Method3
{ 
    public static void main(String[] args) 
    { 
        Finalize_Method3 m = new Finalize_Method3(); 
  
        // Calling finalize method Explicitly. 
        m.finalize(); 
        m.finalize(); 
        m = null; 
  
        // Requesting JVM to call Garbage Collector method 
        System.gc(); 
        System.out.println("Main Completes"); 
    } 
    // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    } 
}