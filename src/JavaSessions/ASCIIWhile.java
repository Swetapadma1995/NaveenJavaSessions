package JavaSessions;

public class ASCIIWhile {

	 public static void main(String[] args) {

	        // Print A-Z and their ASCII values using while loop
	        char ch = 'A';
	        while (ch <= 'Z') {
	            System.out.println(ch + ": " + (int) ch);
	            ch++;
	        }

	        // Print a-z and their ASCII values using while loop
	        ch = 'a';
	        while (ch <= 'z') {
	            System.out.println(ch + ": " + (int) ch);
	            ch++;
	        }
	        
	        // Print 0-9 and their ASCII values using while loop
	        ch = '0';
	        while (ch <= '9') {
	            System.out.println(ch + ": " + (int) ch);
	            ch++;
	        }
	        

	
	 }
}
