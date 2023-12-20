package JavaSessions;

public class Customer {
	
	//customer class variables:
	String firstName;
	String lastName;
	String email;
	String telephoneNo;
	String password;
	boolean subscribe;

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.firstName = "Neha";
		c1.lastName ="yadav";
		c1.password ="Neha@123";
		c1.subscribe = true;
		
        Customer c2 = new Customer();
		c2.firstName = "Ravi";
		c2.lastName ="sharma";
		c2.subscribe = false;
		
		Customer c3 = new Customer();
		c3.firstName = "Sangita";
		c3.password ="Sangita@123";
		
		Customer c4 = new Customer();
		c4.firstName = "Pooja";
		c4.lastName ="bhatt";
		c4.password ="Pooja@123";
		c4.subscribe = true;
		c4.email ="Pooja@gmail.com";
		c4.telephoneNo = "2345678324";
		
		
		
		
		

	}

}
