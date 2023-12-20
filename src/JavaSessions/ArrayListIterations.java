package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIterations {

	public static void main(String[] args) {
		
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(100);
		num.add(200);
		num.add(300);
		num.add(400);
		num.add(500);
		num.add(600);
		
		System.out.println(num);
		
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}
		System.out.println("-------------------");
		
		for(int e: num)
		{
			System.out.println(e);
		}
		
		ArrayList<String> empName = new ArrayList<String>();
		empName.add("Tom");
		empName.add("Kam");
		empName.add("Ram");
		empName.add("Sam");
		empName.add("Peter");
		empName.add("Tom");
		empName.add("Tom");
		empName.add("Tom");
		empName.add(null);
		empName.add(null);
		
		System.out.println(empName);
		
		for(String e : empName)
		{
			System.out.println(e);
		}
		
	//	
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("pooja");
		studentList.add("neha");
		studentList.add("sita");
		studentList.add("rihu");
		
		studentList.add(4, "tina");
		
		//studentList.add(8, "citu"); //IndexOutOfBoundsException
		
		System.out.println(studentList.get(4));
		System.out.println(studentList);
		
		studentList.remove(1);
		studentList.add(1, "ritu");
		studentList.set(2, "pitu");
		
		System.out.println(studentList);
		System.out.println(studentList.size());
		
		ArrayList<String> nList = new ArrayList<String>(Arrays.asList("Rani","Pini","Rini","Chini"));
		System.out.println(nList);
		System.out.println(nList.size());
		nList.add("Gita");
		System.out.println(nList);
		System.out.println(nList.size());
		
		// Use cases of ArrayList- Footer section-: Contact Us, Privacy Policy, NewLetters
		//ActualList : Contact Us, Privacy Policy, NewLetters
		//ExpectedList:
		ArrayList<String> footerList = new ArrayList<String> (Arrays.asList("Contact Us", "Privacy Policy", "NewLetters"));
		//if(ActualList is equals to ExpectedList){
		  //pass
		//}
		
		
		//
		ArrayList<String> nameList = new ArrayList<String>()  {{
			add("Hari");
			add("Jenny");
			
		}};
		
		
		
		
		
		
	}

}
