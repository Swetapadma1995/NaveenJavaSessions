
package JavaSessions;

public class Browser {
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("browser name is .. " + browserName);
		boolean flag = true;
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome is lauched");
			break;
		case "safari":
			System.out.println("safari is lauched");
			break;
		case "firefox":
			System.out.println("firefox is lauched");
			break;
		case "edge":
			System.out.println("edge is lauched");
			break;
		default:
			System.out.println("please enter right browser name... " + browserName);
			flag = false;
		}
		return flag;	
	}
	
	public int getStudentMarks(String studentName) {
		
		System.out.println("getting marks for the student: "+studentName);
	
		int marks = -1;
		
		if(studentName.equals("Sangita")) {
			//return 90;
			marks = 90;
		}
		else if(studentName.equals("Sweta")) {
	        //return 80;	
			marks = 80;
		}
		else if(studentName.equals("Biranchi")) {
			//return 100;
			marks = 100;
		}
		else if(studentName.equals("Papu")) {
			//return 0;
			marks = 0;
		}
		else {
			System.out.println("please pass the right student name..."+studentName);
			//return -1;
		}
		return marks;
	}
	
	public static void main(String[] args) {  //caller method
	
		Browser br = new Browser();
		Boolean flag = br.launchBrowser("safari");
		if(flag) {
			System.out.println("enter url");
		}
		else {
			System.out.println("error... no browser is there");
		}
		
		
		int stMarks = br.getStudentMarks("Sweta");
		System.out.println(stMarks);
		if (stMarks >= 0) {
			System.out.println("print the marksheet");
		}
	}

}
