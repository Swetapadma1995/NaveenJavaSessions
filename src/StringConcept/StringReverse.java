package StringConcept;

public class StringReverse {
	
	//WAF: name: reverseString
	//param: str
	//return String: reversed string

	public static String reverseString(String str) {
		
		//null check
		if(str==null) {
			System.out.println("String is null, can not reverse, plz pass the right value");
			//return null;
			//return "String is null";
			//return -1; //NA -1 is int type
		}
		
		//string is multiple space:
		if(str.isBlank()) {
			System.out.println("String is having blank space");
			return str;
		}
		
		int len = str.length();
		//length check == 1
		if(len==1 || len==0) {
			return str;
		}	
		
		String rev = "";
		for(int i = len-1 ; i>=0 ; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;	
	}

	public static void main(String[] args) {
		
		System.out.println(reverseString("selenium"));
		System.out.println(reverseString("1234"));
		System.out.println(reverseString("Sangita is a girl"));
		System.out.println(reverseString("T"));
		//System.out.println(reverseString(null));//NullPointerExeception
		//System.out.println(reverseString(""));
		System.out.println(reverseString("          "));//it is going to reverse method
		
		
		
		
		
		
		
		
		
		
		//String str = "Automation";
		//StringBuilder st = new StringBuilder("Selenium");
		//System.out.println(st.reverse());
		
		
		
		
		
		
	}

}
