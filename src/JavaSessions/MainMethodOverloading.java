package JavaSessions;

public class MainMethodOverloading {

	//can I overload a main method??  --> yes
	
	public static void main(String[] args) {
		System.out.println("main method");
		MainMethodOverloading.main(90);
	}
	
	public static void main(String args) {
		System.out.println("main method 1");
	}

	public static void main(int a) {
		System.out.println("main method " +a );
	}

	public static void main(int x, int y) {
		System.out.println("main method " +x+y);
	}
	
}


