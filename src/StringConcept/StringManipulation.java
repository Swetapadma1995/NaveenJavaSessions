package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "Hi this is my java code and I am so happy";
		
		System.out.println(str.length());
		System.out.println("Lowest Index: "+ 0);
		System.out.println("Highest Index: " + (str.length()-1));
		
		System.out.println(str.charAt(0));//H
		System.out.println(str.charAt(40));//Y
		System.out.println(str.charAt(34));//o
		//System.out.println(str.charAt(41));// StringIndexOutOfBoundException
		//System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("i")); //1 - 1st occurance of i
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//2 - 2nd occurance of i
		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));//3 - 3rd occurance of i
		
		System.out.println(str.indexOf("I", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));//4 - 4th occurance of i
		
		System.out.println(str.indexOf("java"));//14
		System.out.println(str.indexOf("Naveen"));// -1
		
		String msg = "Welcome to me";
		if(msg.indexOf("to")!= -1) {
			System.out.println("to is there");
		}
		else {
			System.out.println("Fail");
		}
		
		//trim:
		String sr = "    Hello    world    ";
		System.out.println(sr.trim());
		
		//replace:
		String dob = "01-01-1995";
		System.out.println(dob.replace("-", "/"));
		
		String sr1 = "   hello     world   ";
		System.out.println(sr1.replace(" ", ""));
		
		//toLower and toUpper:
		String sf = "This is a Girl";
		System.out.println(sf.toLowerCase());
		System.out.println(sf.toUpperCase());
		
		//comparison:
		String l1 = "Hello Selenium";
		String l2 = "Hello Selenium";
		System.out.println(l1.equals(l2));//true
		String l3 = "Hello selenium";
		System.out.println(l1.equals(l3));
		System.out.println(l1.equalsIgnoreCase(l3));
		
		//contains:
		String m1 = "Hello this is java language";
		System.out.println(m1.contains("java"));
		if(m1.contains("java")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//sub-string:
		String loop = "your order id is 1234";
		System.out.println(loop.substring(7));
		System.out.println(loop.substring(4, 16));
		System.out.println(loop.substring(loop.indexOf("is")+3, loop.length()));
		
		//split:
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[] = lang.split("_");
		System.out.println(lg[0]);//JAVA
		System.out.println(lg[2]);//RUBY
		System.out.println(Arrays.toString(lg));
		
		System.out.println("----------------------");
		
		String pop ="xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String p[] = pop.split("xX");
		System.out.println(p[0]);//blank value - empty
		//System.out.println(p[0].length());//0
		System.out.println(p[1]);//HelloSelenium
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		//System.out.println(p[5]);//AIOB
		System.out.println(Arrays.toString(p));
		
		System.out.println("------------------------");
		
		String empInfo = "Sangita;Das;Basudevpur;Bhadrak;Odisha;Bangalore";
		System.out.println(empInfo.split(";")[0]);
		System.out.println(empInfo.split(";")[1]);
		System.out.println(empInfo.split(";")[2]);
		
		System.out.println("-------------------------");
		
		String domain = "test.automation.python.java";
		//String dm[] = domain.split(".");
		//System.out.println(dm[0]);  //ArrayIndexOutOfBoundsException
		
		String dm[] = domain.split("\\.");
		System.out.println(dm[0]);  //test
		
		String data = "test|automation|python|java";
		//String d[] = data.split("|");
		//System.out.println(d[0]);
		
		String d[] = data.split("\\|");
		System.out.println(d[0]);
		
		String foo = "I love java coding";  //I love "java" coding
		System.out.println("I love \"java\" coding");
		
		System.out.println("I love 'java' coding");
		
		//"I love java coding"
		System.out.println("\"I love java coding\"");
		
		String x1 = getXpath("Papu");
		System.out.println(x1);
	
		
	}

		public static String getXpath(String empName) {
			
			String xpath = "//input[@name='"+empName+"']";
			return xpath;
		}
	
}
