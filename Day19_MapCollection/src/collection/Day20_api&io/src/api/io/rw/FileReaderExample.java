package api.io.rw;

import java.io.*;

public class FileReaderExample {

	public static void main(String[] args) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("D:/Example/greeting.txt");
			
			while(true) {
				int i = fr.read();
				System.out.print((char)i);
				if(i == -1) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
