// Java program to control the Main Thread & Set Different Priority
public class Main_Thread_EX extends Thread 
{ 
	public static void main(String[] args) 
	{ 
		// getting reference to Main thread 
        Thread t = Thread.currentThread();
        Thread t1 = Thread.currentThread();
		
		// getting name of Main thread 
		System.out.println("Current thread: " + t.getName()); 
		
		// changing name of Main thread 
		t.setName("Geeks"); 
		System.out.println("After name change: " + t.getName()); 
		
		// Default priority of Main thread is 5 , Minimum is 1 , Maximum is 10 And You Set priority from 1 to 10
		System.out.println("Main thread priority No. t1 reference: "+ t1.getPriority()); //Default
		 
        t.setPriority(MAX_PRIORITY);
        System.out.println("Main thread new priority: "+ t.getPriority());
        
        t.setPriority(7);
        System.out.println("Set Main thread priority: "+ t.getPriority()); 
		
		// Main thread creating a child thread 
		ChildThread ct = new ChildThread(); 
		
		// getting priority of child thread which will be inherited from Main thread as it is created by Main thread 
		System.out.println("Child thread priority: "+ ct.getPriority()); 
		
		// set Main thread to MIN(1) 
		ct.setPriority(MIN_PRIORITY); 
		System.out.println("Child thread new priority: "+ ct.getPriority()); 
		
		// starting child thread 
		ct.start(); 
	} 
} 

// Child Thread class 
class ChildThread extends Thread 
{ 
	@Override
	public void run() 
	{ 
		for (int i = 0; i < 3; i++) 
		{ 
			System.out.println("Child thread"); 
		} 
	} 
}