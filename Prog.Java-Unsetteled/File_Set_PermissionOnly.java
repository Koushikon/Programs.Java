import java.io.File;
public class File_Set_PermissionOnly
{
	public static void main(String[] args)
    {
        File myFile = new File("Out.txt");
		if (myFile.exists())
        {
            System.out.println(myFile.getName() + " Exists And Work is Done");
            //change file permissions for application user only
            myFile.setReadable(false);
            myFile.setWritable(false);
            myFile.setExecutable(false);

            //change file permissions for other users also
            myFile.setReadable(false, false);
            myFile.setWritable(false, false);
            myFile.setExecutable(true, true);
        }
        else
			System.out.println("File does not exist");
    }
}