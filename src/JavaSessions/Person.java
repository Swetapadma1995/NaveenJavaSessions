package JavaSessions;

public class Person {
	
	//method overloading : OOP: Poly(many) + morphism(forms) : complileTime(Static , early binding)
	// When in the same class , we have different methods:
	//1. with the same name
	//2. with different number of parameters
	//3. with different type of parameters
	//4. return type does not matter
	//5. sequence of the parameter should be different
	
	public void test() {
		System.out.println("test method");
	}
	
	public int test(int a) {
		System.out.println("test method: " +a);
		return 100;
	}
	
	public void test(String a) {
		System.out.println("test method :" +a);
	}
	
	public void test(int a , int b) {
		System.out.println("test method :" + a+b);
	}
	
	public void test(String a , int b) {
		System.out.println("test method :" + a+b);
	}

	public void test(int a , String b) {
		System.out.println("test method : " + a+b);
	}
	
	public void test(float a, int b) {
		System.out.println("test method :" + a+b);
	}
	
	//ecom: examples
	public void login(String un , String psw) {
		
	}
	public void login(String un , String psw, int otp) {
		
	}
	public void login(String un , String psw, String phn) {
	
	}
	public void login(String emailid) {
	
	}
	
	//search
	public void search() {
		
	}
	
    public void search(String productName) {
		
	}
    
    public void search(String productName , int price ) {
		
	}
    
    public void search(String productName , int price , String seller) {
		
	}
	
    //payment
     public void payment(String upi) {
    	
    }
	
    public void payment(String card, int cvv) {
    	
    }

    public void payment(String paypalId , String pwd) {
	
    }
    
    //uber booking:
    public void booking(String carType , String stPoint , String endPoint) {
    	
    }
    
    public void booking(String carType , String stPoint , String endPoint , int paasenger) {
    	
    }
    
        
	public static void main(String[] args) {
	
		Person p = new Person();
		p.test();
		p.test("sam" , 7);
		p.test(5, 90);
		
		
				
		
		
		
		
		
	}

}
