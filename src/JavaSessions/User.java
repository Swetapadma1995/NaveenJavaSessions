package JavaSessions;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "Rahul";
		u1.age = 23;
		u1.city = "pune";
		
		User u2 = new User();
		u2.name = "Pooja";
		u2.age = 25;
		u2.city = "blr";
		
		User u3 = new User();
		u3.name = "Satish";
		u3.age = 26;
		u3.city = "hyd";
		
		User u4 = new User();
		u4.name = "Teju";
		u4.age = 29;
		u4.city = "odisha";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("-----------------------");
		
		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("-------------------------");
		
		u2 = u3;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("---------------------------");
		
		u3 = u4;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("----------------------------");
		
		u4 = u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);

		

	}

}
