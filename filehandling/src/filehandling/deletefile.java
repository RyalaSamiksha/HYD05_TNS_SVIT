package filehandling;

import java.io.File;
import java.io.IOException;

public class deletefile {
	public static void main(String[] args) throws IOException{
		
		try
		{
			File myFile = new File("task.txt");
			if(myFile.exists())
			{
				myFile.delete();
				System.out.println("File deleted Successfully...");
;			}
			else
			{
				System.out.println("File DO NOT Exist");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


