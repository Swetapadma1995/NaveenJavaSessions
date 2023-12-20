package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		Ecommerce e = new Ecommerce();
		
		e.login("san@gmail.com" , "San@123")
			.search("mobile")
				.selectProduct("iphone")
					.addToCart("mobile")
						.doPayment("credit card", 567)
							.generateOrderId()
								.logout();
		
		System.out.println("-----------------------------");
		
		e.login("san@gmail.com" , "San@123")
			.search("laptop", "black")
				.selectProduct("MACbook")
					.logout();
		
		System.out.println("-----------------------------");
		
		e.login("san@gmail.com" , "San@123")
			.search("shoe", "blue")
				.search("nike")
					.logout();
						
		System.out.println("----------------------------------");
		
		e.login("abc@gmail.com", "abc@678")
			.logout();
		
		System.out.println("------------------------------");

		e.login("abc@gmail.com", "abc@678");
		
		System.out.println("--------------------------------");
		
		e.login()
			.search("shoe", "blue")
				.search("nike")
					.logout();
			
		
	}

}
