package JavaSessions;

public class FinalKeyword {
	
	static final int wheels = 4;

	public static void main(String[] args) {
	
		//local variables can't be Static
		//static int price = 600;
		
		final int price = 600;
		
		final int days = 7;
		System.out.println(days*100);
		
		//days = 10;
		//System.out.println(days*100);
		
		
			}

}

//Why main method is static and void??
//main() is caller / user method: no business logic. no return that's why void
//static: no need to create the object by JVM

