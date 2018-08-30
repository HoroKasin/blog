package Pen;

public class PenMain {

	public static void main(String[] args) {
		
		Pen blackPen = new Pen();
		
		blackPen.color = "∞À¡§";
		blackPen.price = 500;
		
		blackPen.write();
		
		Pen redPen = new Pen();
		redPen.color = "ª°∞≠";
		redPen.price = 600;
		
		redPen.write();
		
		System.out.println(blackPen.color);
	}
}





