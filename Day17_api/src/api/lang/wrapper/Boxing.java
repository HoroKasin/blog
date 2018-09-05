package api.lang.wrapper;

import java.util.Arrays;

public class Boxing {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'H';
		boolean d = false;
		
		//Boxing: To change basic typing to object type.
		Integer val1 = new Integer(a);
		Double val2 = new Double(b);
		Character val3 = new Character(c);
		Boolean val4 = new Boolean(d);
		Byte val5 = new Byte((byte)72);
		String val6 = new String("hello");
		
		Object[] arr = {val1, val2, val3, val4, val5, val6};
		System.out.println(Arrays.toString(arr));
		
		//Unboxing: To replace packaged base type objects with default type again.
		//Use basic type name+Value() method provided by Packaging class.
		a = val1.intValue();
		b = val2.doubleValue();
		c = val3.charValue();
		d = val4.booleanValue();
		byte e = val5.byteValue();

	}

}






