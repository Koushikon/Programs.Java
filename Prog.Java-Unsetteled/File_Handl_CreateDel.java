import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class File_Handl_CreateDel
{

	public static void main(String[] args)
    {
        File file = new File("data.txt");
		try {
			boolean createNewFile = file.createNewFile();
            System.out.println("File Created = "+createNewFile);
		}
        catch (IOException e)
        {
			// TO-DO Auto Generated catch block
			e.printStackTrace();
        }
        boolean delete = file.delete();
		System.out.println("File deleted = " + delete);
	}
}