package api.io.obj;

import java.io.*;
import java.util.Arrays;

public class ObjectIOExample {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("D:/Example/obj.data");
			oos = new ObjectOutputStream(fos);
			
			//Use the writeObject method to output objects.
			oos.writeObject(new Integer(10));
			oos.writeObject(new Double(3.14));
			oos.writeObject(new int[] {1,3,5,7});
			oos.writeObject(new String("¾È³ç~~"));
			
			System.out.println("Object information has been saved to a file.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		System.out.println("Recalls stored object information.");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("D:/Example/obj.data");
			ois = new ObjectInputStream(fis);
			
			/*
			 * Use the readObject() method to retrieve object information.
			 * readObject() imports objects one by one in the order in which they are stored.
			 * Returns the object to the Object Type.
			 */
			Integer a = (Integer)ois.readObject();
			Double b = (Double)ois.readObject();
			int[] c = (int[])ois.readObject();
			String d = (String)ois.readObject();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(Arrays.toString(c));
			System.out.println(d);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}





