import java.io.*;
public class CopyFile
{
  public static void main(String []args)throws IOException, FileNotFoundException
    {
      File inFile=new File("Out.txt");
      FileReader in=new FileReader(inFile);
      File outFile=new File("Out2.txt");
      FileWriter out=new FileWriter(outFile);

      //Copy the file one character at a time...
      int c;
      while((c=in.read())!=-1)
      out.write(c);
      in.close();
      out.close();
      System.out.println("The copy was sucessful.");
    }
}
