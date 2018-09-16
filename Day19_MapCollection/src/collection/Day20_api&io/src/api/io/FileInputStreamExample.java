package api.io;

import java.io.*;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		/*
		 * 1. The classes used to retrieve files are:
		 * FileInputStream.
		 * 2. Specifies the path to the file to be read as the generator's parameter.
		 * 3. Throws method and constructor for all classes of ioPage
		 * Because the keywords are attached, when using the ioPage class,
		 * Thry to catch block must be completed together.
		 * 4. Classes in the io-package have direct access to system resources.
		 * Resources must be returned via the close() message.
		 * 
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:/Example/test.txt");//Please set your own folder path.
			
			//read()The message reads the data in one byte increments.
			//return -1 if there is no more data to read
			while(true) {
				int data = fis.read();
				System.out.print((char)data);
				
				if(data == -1) break;
			}			
		}catch (FileNotFoundException e) {
			System.out.println("No files found in the specified path.");
		}catch (IOException e) {
			System.out.println("Unable to read the file.");
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}







