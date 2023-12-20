package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
	
	String name;
	
	//1. no input and no return
	public void test() {
		System.out.println("test method");
	}
			
	//2. no input but some return value
	public int getInfo() {
		System.out.println("get info method");
		int a=10;
		int b=20;
		int c= a+b;
		return c;
	}
	
	public String getName() {
		System.out.println("get name method");
		String name = "Sangita";
		return name;
	}
	
	public ArrayList<String> getEmpNames() {
		System.out.println("get emp names");
		String em1 = "San";
		String em2 = "Ran";
		//return em1;
		//return em2; ---> we cannot return multiple values from the method
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add(em1);
		empList.add(em2);
		return empList;
	}
	
	public String[] getEmployee() {
		System.out.println("get emp method");
		String emp[] = {"Ram","Sam"};
		return emp;
	}

	//3. some input and some return
	public int sum(int a , int b) { //parameters
		System.out.println("sum method");
		int total = a+b;
		return total;
	}
	
	public float getBill(int foodBill , int drinkBill, float tax) {
		System.out.println("total bill amount");
		float total = foodBill + drinkBill + tax;
		return total;
	}
	
	public static void main(String[] args) {
		
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		obj.name = "Tom";
		
		int s = obj.getInfo();
		System.out.println(s+10+20-10);
		System.out.println(s+45);
		System.out.println(obj.getInfo()+12+20-10); //not good practice
		
		String n1 = obj.getName();
		System.out.println(n1);
		System.out.println(n1+" is a good girl");
		System.out.println(obj.getName()+"bmjhgj");//not good practice
		
		ArrayList<String> e = obj.getEmpNames();
		System.out.println("total emp "+ e.size());
		System.out.println(e);
		
		String employee[] = obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));
		
		int add = obj.sum(20, 65); //arguments
		System.out.println(add);
		
		float finalBill = obj.getBill(500, 300, 0.5f); // calling a function/method by passing the value/arg: call by value/arg
		System.out.println(finalBill);
		
		
	}

}
