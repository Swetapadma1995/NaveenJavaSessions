package StringConcept;

public class User {

	public static void main(String[] args) {
		
		//String: is a class
		//1. using new keyword
			String s1 = new String("Hello");//2 objects are created 1st is in heap memory and 2nd is on SCP 
			
		//2. using literals
			String s2 = "Selenium";//1 object created in String Constant Pool 
			
			String s3 = "Hello";
			String s4 = new String("Hello");//1 object is created in heap memory
			
			System.out.println(s1 == s3);
			System.out.println(s1.equals(s3));
			System.out.println(s1 == s4);//false
			System.out.println(s1.equals(s4));
			
			String s5 = "Hello";
			System.out.println(s3 == s5);
			
			String s6 = "hello";//1 object is created in SCP pointing s6
			
			String s7 = new String("Naveen");//2 object is created
			
			String s8 = s7.intern();
			System.out.println(s7 == s8);//false
			
			String str = "Hello";
			//str = str+"Selenium";
			//System.out.println(str);//HelloSelenium
			
			System.out.println(str+100);//Hello100
			System.out.println(str+200);
			
			StringBuilder sb = new StringBuilder("Testing");//1 object created
			System.out.println(sb);
			System.out.println(sb.append("Automation"));
			System.out.println(sb);
			
			String gg = "Naveen";
			System.out.println(gg.concat("2"));
			System.out.println(gg);
		
	}
	

}
