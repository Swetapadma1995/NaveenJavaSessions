package OOP_Interface;

public interface USMedical extends WHO{
	
	//no method body/ only method declaration: abstract method
	//bydefault all the methods in interface are Abstract in nature so no need to mention
	//can not create the object of interface in java
	//all abstraction methods are non static
	//interface can't have parent class
	
	int min_fee = 10;  //bydefault all the variables declared in interface are static and final
	
	public void physioServices();
	
	public void oncologyServices();
	
	public void pediaServices();
	
	public void emergencyServices();
	
	//after JDK 1.8 : two major changes:
	//1. can have static method but with method body:
	public static void billing() {
		//buss logic
		System.out.println("US--billing");
	}
	
	//2. can have a default method with method body: non static:
	default void RnD() {
		System.out.println("US--R&D");
	}
	
	//class - class -> extends
	//class - interface -> implements
	//interface - interface -> extends
	//interface - class -> NA(NOT APPLICABLE)

}
