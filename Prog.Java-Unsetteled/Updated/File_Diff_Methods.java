import java.io.File;
public class File_Diff_Methods
{
	public static void main(String[] args)
    {
		File myFile = new File("Data1.doc");
		if (myFile.exists())
        {
			System.out.println(myFile.getName() + " Exists And Work is Done");
			System.out.println("The file is " + myFile.length() + " bytes long");
			if (myFile.canRead())
				System.out.println(" Ok to read");
			else
				System.out.println(" Not ok to read");
			if (myFile.canWrite())
				System.out.println(" Ok to write");
			else
                System.out.println(" Not ok to write");
            if (myFile.canExecute())
				System.out.println(" Ok to Execute");
			else
				System.out.println(" Not ok to Execute");
			if (myFile.isHidden())
				System.out.println(" Yes Hidden");
			else
				System.out.println(" No Hidden");
            System.out.println(" Get Path: " +myFile.getPath());
            System.out.println(" Get Parent File: " +myFile.getParentFile());
			System.out.println(" Get Absolute Path: " +myFile.getAbsolutePath());
			System.out.println(" File Name: "+ myFile.getName());
            System.out.println(" Get Parent: "+ myFile.getParent());
            System.out.println(" Last Modified: "+ myFile.lastModified());
            System.out.println(" is Directory: "+ myFile.isDirectory());
            
		}
		else
			System.out.println("File does not exist");
	}
}