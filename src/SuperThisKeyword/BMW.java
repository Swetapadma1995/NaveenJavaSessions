package SuperThisKeyword;

public class BMW extends Car {
	
	int speed = 200;
	
	public BMW() {
		super(20,30);   //Always be the 1st statement in the BMW const...
		//this(4);		//this & super keyword can not be togather
		//super(10);	//Not allowed
		System.out.println("BMW constructor");
	}
	
	public BMW(int p) {
		this();
		System.out.println("BMW constructor " +p);
	}
	
	@Override
	public void displayInfo() {
		System.out.println("BMW info");
	}

	public void displayBMWInfo() {
		System.out.println("BMW systen info");
		System.out.println(speed);//200
		System.out.println(super.speed);//100
		
		displayInfo();//child class method called
		super.displayInfo();//car method called
	}
	
	//super:  pointing to the parent class object
	//1. in the child class constructor but it should be the first statement in the child class constructor
	//2. when you have same properties (Method overridding/same var) in parent and child but you want to call/access parent class property -- use super keyword
	
	
	//this:  pointing to the current class object
	//1. can call other constructor in the same class
	//2. either this() or super()
	//3. should be the 1st statement in the constructor
	//4. this keyword is used to initialize the instance variables with the local variables in constructors and methods
	//5. can return this keyword also from the method
}
