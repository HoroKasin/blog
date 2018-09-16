package api.io.rw;

import java.io.*;

public class FileWriterExample {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:/Example/greeting.txt");
			
			String str = "Hello? Nice to meet you? See you again?";
			
			fw.write(str);
			
			System.out.println("File saved successfully.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}



