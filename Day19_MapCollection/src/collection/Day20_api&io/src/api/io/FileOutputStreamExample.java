package api.io;

import java.io.*;
import java.util.Scanner;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a file name to save.");
		System.out.print("> ");
		String fileName = scan.next();
		
		try {
			fos = new FileOutputStream("D:/Example/" + fileName + ".txt");
			
			String str = "Hello. This is Gil Dong Hong. I am in Java class.";
			
			//write method of fileOutputStream class
			//To output String data since only data can be printed
			//must be converted to byte
			
			// getBytes() message provided by StringClass
			// convert text to byte type and return to byte array
			byte[] bs = str.getBytes();
			
			fos.write(bs);
			
			System.out.println("File saved successfully.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				scan.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
