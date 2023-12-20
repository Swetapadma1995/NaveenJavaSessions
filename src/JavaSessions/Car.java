package JavaSessions;

public class Car {
	
	String name;
	int price;
	String chesisNumber;
	static final int wheels = 4; //static elements created in CMA(Common Memory Allocation) or it is called Metaspace(dynamic size)

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 50;
		c1.chesisNumber = "54326BMW";
				
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 60;
		c2.chesisNumber = "32434AUDI";
				
		Car c3 = new Car();
		c3.name = "HONDA";
		c3.price = 20;
		c3.chesisNumber = "324434HONDA";
		
		//how to call static variables:
		//1. use directly:
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price+" " + c1.chesisNumber+" " + wheels);
		
		//2. use it with the class name: from anywhere
		System.out.println(Car.wheels);
		
		//3. Can I call static var with object ref name??
		//noooo
		System.out.println(c1.wheels);//not good practice
		
	}

}
