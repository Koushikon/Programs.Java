//File program
import java.io.*;
public class PrimitivesToFile_Appl
{
  public static void main(String []args)
  {
    try
    {
      FileWriter fileWriter=new FileWriter("Out.txt");

      //Wrap the PrintWriter with a PrintWriter
      //for sending the output t the file
      PrintWriter printWriter=new PrintWriter(fileWriter);
      boolean b=true;
      byte by=127;
      short s=1111;
      int i=1234567;
      long l=123456789;
      float f=432.5f;
      double d=1.23e-15;
      printWriter.print(b);
      printWriter.print(by);
      printWriter.print(s);
      printWriter.print(i);
      printWriter.print(l);
      printWriter.print(f);
      printWriter.print(d);
      printWriter.close();
    }
    catch(IOException e)
    {
      System.out.println("IO Erro"+e);
    }
  }
}
