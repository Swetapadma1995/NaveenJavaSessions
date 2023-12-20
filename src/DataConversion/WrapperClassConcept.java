package DataConversion;

import java.util.ArrayList;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20); //10020
		
		//String to int: -->Integer:
		int i = Integer.parseInt(x);//100
		System.out.println(i+20); //120
		
		//String to double: -->Double:
		String y = "12.78";
		System.out.println(y+10);//12.7810
		double d = Double.parseDouble(y);
		System.out.println(d);//12.78
		System.out.println(d+30.0);//42.78
		
		//String to boolean:
		String remoteExecution = "true";
		boolean flag = Boolean.parseBoolean(remoteExecution);
		if(flag) {
			System.out.println("run testcases on AWS cloud");
		}
		else {
			System.out.println("run testcases in local");
		}
		
		//int to string:
		int age = 30;
		String ageVal = String.valueOf(age);
		System.out.println(ageVal+30);
		
		//double to String:
		double sal = 56.98;
		String salVal = String.valueOf(sal);
		System.out.println(salVal.length());
		
		//String a = "100A";
		//String to int -->Integer
		//int b = Integer.parseInt(a);//NumberFormatException
		//System.out.println(b); 
		
		String s = "100Test";
		String r = s.replace("Test", "");//100
		System.out.println(r); //100
		int g = Integer.parseInt(r);
		System.out.println(g+10);//100
		
	    System.out.println(Byte.MIN_VALUE);
	    System.out.println(Byte.MAX_VALUE);
	    
	    System.out.println(Integer.MIN_VALUE);
	    System.out.println(Integer.MAX_VALUE);
	    
	    
		
	}

}
