package program9;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class Organization implements Raiseable
{
	public void create(String fileName)
	{
		try
		{
			File newFile = new File(fileName);
		}
		catch(Exception e)
		{
			System.out.println("Creation Error");
		}
	}
	
	public void display(String filename)
	{
		try
		{
			Scanner reader = new Scnaner(Paths.got(fileName));
			if(reader.hasNextLine() == false)
			{
				System.out.println("Empty file");
			}
			while(reader.hasNextLine())
			{
				String textline = reader.nextLine();
				System.out.println(textline);
			}
		}
		
		catch(Exception e)
		{
			System.out.println("File error");
		}
	}
	
	
	/*
	 * Read: Scanner reader = new Scanner(Paths.get(<the file name>)
	 * Scanner reader = new Scanner(Paths.get(<the file name>)
	 * Write: PrintWrite writer = new PrintWriter(new FileWriter(<the file name>,true))
	 * hasNextLine() - reads if their is a line beneath the current one
	 * nextLine() - 
	 * Writer.write(" ");
	 * 
	 *  use try catch in everyone one of our methods
	 */

	/*
	 * For program 8- use remainder of two for bitstrings
	 */
}
