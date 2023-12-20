package JavaSessions;

public class Employee {
	
	//class variables
	String name;
	int empId;
	String dept;
	boolean isPerm;
	double salary;

	public static void main(String[] args) {
		
		//local variable
		int i = 10;
		
		Employee e1 = new Employee();
		
		e1.name = "Rahul";
		e1.empId = 1;
		e1.dept = "QA";
		e1.isPerm = true;
		e1.salary = 23.76;
		
		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);
		
		System.out.println("-----------");
		
		Employee e2 = new Employee();
		
		e2.name = "Tom";
		e2.empId = 2;
		e2.salary = 56.98;
		
		System.out.println(e2.name);
		System.out.println(e2.empId);
		System.out.println(e2.dept);
		System.out.println(e2.isPerm);
		System.out.println(e2.salary);
		
		//No reference object 
		new Employee().name = "Ravi";
		new Employee().salary = 45.65;
		
		//null reference object
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "Neha";
		System.out.println(e3); //NullPointerException
		//null ---> NPE
		
		System.gc(); // No gurantee that Garbage collector will go to heap memory	
		
		
		
		
		
	
	}

}
