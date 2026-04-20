class Finalize_Method4
{ 
    public static void main(String[] args) 
    { 
        Finalize_Method4 j = new Finalize_Method4(); 
        // Calling finalize method Explicitly. 
        j.finalize(); 
  
        j = null; 
  
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