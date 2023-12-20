package JavaSessions;

public class ReverseArray {

	public static void main(String[] args) {
		
		int i[]= {1,2,3,4,5,6,7,8};
		int count=i.length-1;
		for(int e : i)
		{
			e=count;
			System.out.println(i[e]);
			count--;
		}
		

	}

}
