package overloading.calc;

public class Calculator {
	
	//Square Width
	double areaRect(double len) {
		return len * len;
	}
	
	//Rectangular Width
	double areaRect(double width, double height) {
		return width * height;
	}
}



