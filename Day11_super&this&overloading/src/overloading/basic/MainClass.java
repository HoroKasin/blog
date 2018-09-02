package overloading.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.inputMessage(35);
		b.inputMessage("hi");
		b.inputMessage(3.14, "hello");
		b.inputMessage(14, 15);
		b.inputMessage("bye", 4.44);
		b.inputMessage(89, 3.1456f, '°¡');
		
		System.out.println(34);
		System.out.println(3.14);
		System.out.println("ggg");
		

	}

}

