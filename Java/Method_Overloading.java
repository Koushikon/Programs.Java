import java.io.*; 
   
class Addition{ 
       
    // adding 2 integer values. 
    public int add(int a, int b){
           
        //int Multi=a*b;   Use this like 2nd method but you need to add variable name after return type..  .
        return (a*b);
    } 

    // adding 4 integer values.
    public int add(int a, int b, int f, int k){      //  with same data type but Number of Parameters must be different...
           
        int sum = a+b+f+k; 
        return sum; 
    }

    // adding 3 integer values.     
    public int add(int a, int b, int c){        
           
        return (a/b+c); 
    }

    // adding 2 double values. 
    public double add(double a, double b){   //& with different data type parameter same or not don't matter...

        return (a*b); 
    }

    // adding 3 double values. 
    public double add(double a, double b, double c){

        return (a+b+c); 
    }
    
    // adding two double values. 
    public float add(float a, float b){     //Using this one method add sum of multiple float values...

        return (a+b); 
    }

} 
   
class Method_Overloading { 
    public static void main (String[] args) { 
           
        Addition ob = new Addition(); 
           
        int intoi = ob.add(3,7); 
        System.out.println("Multiply of two integer value :"+intoi); 
        
        int sumi5 = ob.add(3,2,11,-4);              
        System.out.println("sum of the two integer value :" + sumi5);
        
        int sumi2 = ob.add(16,2,3); 
        System.out.println("sum of the two integer value :" + sumi2); 
        
        double sumd3 = ob.add(6.1,4.0); 
        System.out.println("sum of the three double value :" + sumd3);
        
        double sumd4 = ob.add(3.5,4.0,2.5); 
        System.out.println("sum of the 3 double value :" + sumd4);
        
        float sumf4 = ob.add(52.827f,50.827f); 
        float sumf5 = ob.add(31.827f,21.827f);      //Using different variable add sum another float value... 
        System.out.println("Sum of 2 float value :" +sumf4+ " & Another one : " +sumf5); 
        
    } 
}