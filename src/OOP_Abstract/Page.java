package OOP_Abstract;

public abstract class Page {
	
	//abstract class can't have object/ can't create /instantiate the abstract class
	//but abstract class can have constructor and it will be called when you create the object of child class
	//abstract class can have abstract methods and non-abstract methods
	
	//no abstract methods: 0% abstraction
	//only abstract methods: 100% abstraction
	//abstract + non-abstract methods: [0 - 100%]partial abstraction
	
	//constructor: called by child class object
	public Page() {
		System.out.println("Page constructor");
	}
	
	public Page(int a) {
		System.out.println("Page constructor " + a);
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void pageLoadTime() {
		System.out.println("Page load time out = 10 sec");
	}
	
	public final void logo() {
		System.out.println("App logo");
	}	
	
	
	
}
