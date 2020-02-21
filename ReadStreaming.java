
// imports
package com.javainterviewpoint;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class ReadStreaming
	{
		//Delimiters used in the CSV file
		private static final String COMMA_DELIMITER = ",";
		
		public static void main(String args[])
		{
			 
			Scanner scanner = null;
			try {
				//Get the scanner file
				scanner = new Scanner(new File("Data.csv"));
				//Use Delimiter as COMMA
				scanner.useDelimiter(COMMA_DELIMITER);
				while(scanner.hasNext())
				{
						System.out.print(scanner.next()+"   ");
					
						// list of artist names
						  TopStreamingArtists artistNames = new TopStreamingArtists();
						    artistNames.insert("Stage Name");
						    artistNames.displayList();
						}
				
			} 
			catch (FileNotFoundException fe) 
			{
				fe.printStackTrace();
			}
			finally	{
				scanner.close();
			}
		}
	}
