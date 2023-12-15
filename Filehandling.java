import java.util.*;
import java.io.*;
public class Filehandling {
	public static void main(String args[])
	{
		
//creating a file
		File myFile= new File("C:\\Users\\risha\\eclipse-workspace\\Rishabh\\bin\\rishabhhh.txt");
	try 
	{
		myFile.createNewFile();
	}
	catch(IOException e)
	{
		System.out.println("unable to create file");
		e.printStackTrace();
		
		}
		
//code to write to a file
		try 
		{
		FileWriter fileWriter = new FileWriter("rishabhhh.txt");
		fileWriter.write("This is my file \n now bye ");
		fileWriter.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
//Reading a file
		
		try {
			File myFile = new File("rishabhhh.txt");
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
//deleting the file
		File myFile = new File("rishabhhh.txt");
		if(myFile.delete()) {
			System.out.println("i have deleted the file "+myFile.getName());
		}
		else
		{
			System.out.println("some error occured");
		}
	} 
}
