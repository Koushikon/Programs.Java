import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
public class File_Set_Permission
{
	public static void main(String[] args)
    {
        File myFile = new File("Data1.txt");
        try {
            boolean createNewFile = myFile.createNewFile();
            System.out.println("File Created = "+createNewFile);
		    if (myFile.exists())
            {
                System.out.println(myFile.getName() + " exists");
                //change file permissions for application user only
                myFile.setReadable(false);
                myFile.setWritable(false);
                myFile.setExecutable(false);

                //change file permissions for other users also
                myFile.setReadable(false, false);
                myFile.setWritable(false, false);
                myFile.setExecutable(true, true);
            }
        }
        catch (IOException e)
        {
			// TO-DO Auto  Generated catch block
			e.printStackTrace();
        }
    }
}