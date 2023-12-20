package JavaSessions;

public class CharacterAndASCII {
	
	
	    public static void main(String[] args) {
	        // Print A-Z and their ASCII values
	       for (char ch = 'A'; ch <= 'Z'; ch++) {
	           System.out.println(ch + ": " + (int) ch);
	        }
	        
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            System.out.println(ch + ": " + (int) ch);
	        }
	    	
	    	for (char ch = '0'; ch <= '9'; ch++) {
	            System.out.println(ch + ": " + (int) ch);
	        }

	    }
}