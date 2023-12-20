package JavaSessions;

public class CharASCIIForEach {

	public static void main(String[] args) {
		
		// Create arrays for A-Z, a-z, and 0-9 characters
        char[] upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lowerCaseChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] digitChars = "0123456789".toCharArray();

        // Print A-Z and their ASCII values using for-each loop

        for (char ch : upperCaseChars) {
            System.out.println(ch + ": " + (int) ch);
        }
        
        // Print a-z and their ASCII values using for-each loop

        for (char ch : lowerCaseChars) {
            System.out.println(ch + ": " + (int) ch);
        }
		
     // Print 0-9 and their ASCII values using for-each loop

        for (char ch : digitChars) {
            System.out.println(ch + ": " + (int) ch);
        }
		
		
	}

}
