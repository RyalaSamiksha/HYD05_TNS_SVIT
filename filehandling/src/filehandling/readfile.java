package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class readfile {
	public static void main(String[] args) throws FileNotFoundException{
		
        try
        {
        	File A = new File("task.txt");
        	Scanner myReader = new Scanner(A);
        	while(myReader.hasNextLine())
        	{
        		String data = myReader.nextLine();
        		System.out.println(data);
        	}
        	myReader.close();
        }
        catch(FileNotFoundException e)
        {
        	System.out.println("An Error Occured!!!");
        	e.printStackTrace();
        }
	}

}


