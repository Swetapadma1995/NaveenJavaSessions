package SuperThisKeyword;

public class Car {
	
	int speed = 100;
	
	public Car() {
		System.out.println("Car constructor");
	}
	
	public Car(int a) {
		this(23,30); 
		//this();  //error - Constructor call must be the first statement in a constructor
		System.out.println("Car constructor " + a);
	}
	
	public Car(int a , int b) {
		this();
		System.out.println("Car constructor " +(a+b));
	}
	
	public void displayInfo() {
		System.out.println("Car info");
	}

}
