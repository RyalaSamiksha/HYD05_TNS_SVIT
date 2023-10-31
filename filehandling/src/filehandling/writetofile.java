package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class writetofile {
	
		public static void main(String[] args) throws IOException{
			try
			{
				FileWriter myWriter = new FileWriter("task.txt");
				myWriter.write("Hello,let's quickly learn the operations done in file handling 1.create 2.write 3.read 4.delete");
				
			    myWriter.close();
			    System.out.println("Successfully written into the file");
			}
			catch(IOException e)
			{
				System.out.println("Error Occured!!!");
				e.printStackTrace();
			}
			
		}

	}


