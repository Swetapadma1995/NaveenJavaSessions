package JavaSessions;

public class AssignmentsIncreDecreOperators {

	public static void main(String[] args) {
		
		//1.
		int a= 11;
		a= a++ + ++a;
		System.out.println(a);
		
		//2.
		int b=11, c=22, d;
		d= b + c + b++ + c++ + ++b + ++c;
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		//3.
		int e=0;
		e= e++ - --e + ++e - e--;
		System.out.println(e);
		
		//4.
		//boolean f=true;
		//f++;
		//System.out.println(f);   --> incremental operator is not working in boolean.
		
		//5.
		int f=1, g=2, h=3;
		int i= f-- - g-- - h--;
		System.out.println("f="+f);
		System.out.println("g="+g);
		System.out.println("h="+h);
		System.out.println("i="+i);
		
		//6.
		int j=1, k=2;
		System.out.println(--k - ++j + ++k - --j);
		
		//7.
		//int l=19, m=29, n;  --> first we should initialize the value of n 
		//int res3= l-- - m-- - n--;
		//System.out.println("l="+l);
		//System.out.println("m="+m);
		//System.out.println("n="+n);
		
		//8.
		//int l=11;
		//int res3= --(l++);  --> here we can't use decrement in ()
		
		//9.
		int m=0, n=0;
		int res3 = --m * --n * n-- * m--;
		System.out.println(res3);
		System.out.println(m);
		System.out.println(n);
		
		//10.
		int o=1;
		o= o++ + ++o * --o - o--;
		System.out.println(o);
		
		//11.
		//int o=11++;  --> we can't use incremenal or decremental operator on variables
		//System.out.println(o);
		
		//12.
		int p='A';
		System.out.println(p++);
		
		//13.
		char q='A';
		System.out.println(++q);
		
		//14.
		double d1=1.5, D=2.5;
		System.out.println(d1++ + ++D);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
