//File Programme
import java.io.*;
class FileWriteDemo
{
  public static void main(String []args)throws IOException
  {
    //Open keyword for input...
    BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

    //Output file 'Out.txt'...
    File f=new File("Out.txt");
    if(f.exists())
    {
      System.out.print("Overwrite :- 'Out.txt' ...(y/n)? - ");
      if(!stdin.readLine().toLowerCase().equals("y"))
      return;
    }
    PrintWriter outFile=new PrintWriter(new BufferedWriter(new FileWriter("Out.txt")));
    System.out.println("Type to texts...");
    System.out.println("Press 'Ctrl+Z-^z' to terminate...");
    String s2;
    while((s2=stdin.readLine())!=null)
    outFile.println(s2);
    outFile.close();
  }
}
