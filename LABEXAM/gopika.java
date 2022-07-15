import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
public class gopika{

	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the file name");
			String file1=sc.nextLine();
			
		FileWriter fw=new FileWriter(file1);
		fw.write("Java File Operations.\n used to read a file\n Writting to a New File" );
		fw.close();
		FileReader fr=new FileReader (file1);
        BufferedReader b=new BufferedReader(fr);
		String ch;
		while ((ch=b.readLine())!=null)
		{
			System.out.println(ch);
			
		}
		fr.close();

		
		}
		
		catch(Exception e)
		 {

		}
	}
}