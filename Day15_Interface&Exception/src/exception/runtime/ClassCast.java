package exception.runtime;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCast {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		changeDog(d);
		
		Cat c = new Cat();
		changeDog(c);

	}
	
	public static void changeDog(Animal a) {
		Dog d = (Dog) a;
		System.out.println("Type conversion successful!");
	}

}





