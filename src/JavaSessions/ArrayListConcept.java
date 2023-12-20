package JavaSessions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		System.out.println(ar);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		
		ar.add(12.98);
		ar.add(true);
		ar.add("Sangita");
		System.out.println(ar.size());
		System.out.println(ar.get(7));
		//System.out.println(ar.get(10));
		//System.out.println(ar.get(-1));
		
		ar.add(100);
		ar.add(null);
		ar.add("Sangita");
		System.out.println(ar.size());
		System.out.println(ar);
		
		//Generic Array
		ArrayList<Integer> num= new ArrayList<Integer>();
		num.add(100);
		
		ArrayList<Double> dob = new ArrayList<Double>();
		dob.add(12.87);
		dob.add(100.0);
		
		ArrayList<String> empName = new ArrayList<String>();
		empName.add("Tom");
		empName.add("Peter");
		System.out.println(empName);
		
		ArrayList<Object> infoList = new ArrayList<Object>();
		infoList.add("Selenium");
		infoList.add(4.12);
		infoList.add(true);
		infoList.add(2007);
		infoList.add('A');
		//pc=5, vc=5
		System.out.println(infoList);
		
		
		
		
		
		
		
		
		
		
		
	}

}
