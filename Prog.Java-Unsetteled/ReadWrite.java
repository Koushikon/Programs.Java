//File program
import java.io.*;
class ReadWrite
{
  public static void main(String []args)throws IOException
  {
    byte[] c=new byte[10];
    System.out.println("Enter a string of 10 character... ");
    for(int i=0;i<10;i++)
    c[i]=(byte)System.in.read();
    System.out.println("Following the string which you typed... ");
    System.out.write(c);
  }
}
