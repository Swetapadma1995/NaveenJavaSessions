package JavaSessions;

public class CharASCIIDoWhile{

	public static void main(String[] args) {
		
		// Print A-Z and their ASCII values using do-while loop

        char ch = 'A';
        do {
            System.out.println(ch + ": " + (int) ch);
            ch++;
        } while (ch <= 'Z');
        
        System.out.println("------------------------");
        
     // Print a-z and their ASCII values using do-while loop

        ch = 'a';
        do {
            System.out.println(ch + ": " + (int) ch);
            ch++;
        } while (ch <= 'z');
        
        System.out.println("-------------------------");
        
        // Print 0-9 and their ASCII values using do-while loop

        ch = '0';
        do {
            System.out.println(ch + ": " + (int) ch);
            ch++;
        } while (ch <= '9');
		
	}

}
