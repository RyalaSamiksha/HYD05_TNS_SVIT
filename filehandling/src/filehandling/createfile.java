package filehandling;
import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) {
		
		try
		{
			File A = new File("task.txt");
			if(A.createNewFile())
			{
				System.out.println("File created" + A.getName());
			}
			else
			{
				System.out.println("File already exists");
				System.out.println( A.getAbsolutePath());
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
