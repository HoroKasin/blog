package inter.toy;

public class MainClass {

	public static void main(String[] args) {
		
//		TeddyBear t1 = new TeddyBear();
//		IMove t2 = new TeddyBear();				
//		
//		Mazinger m1 = new Mazinger();
//		IMissile m2 = new Mazinger();
//		IMove m3 = new Mazinger();
//		
//		Airplane a1 = new Airplane();
//		IMissile a2 = new Airplane();
//		ILight a3 = new Airplane();
		
		IToy t = new TeddyBear();
		IToy m = new Mazinger();
		IToy a = new Airplane();
		
		IToy[] toys = {t, m, a};
		
		

	}

}



