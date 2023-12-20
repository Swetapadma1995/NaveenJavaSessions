package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.title();//overridden
		lp.url();//overridden
		lp.pageLoadTime();//overridden
		lp.doLogin("Sangita", "San@123");//indivisual
		lp.logo();//inheritance
		
		//Page p = new Page(); //can't create object of abstract class
		
		//top casting: child class object can be referred by parent class reference variable 
		Page p = new LoginPage();
		p.url();
		p.title();
		p.pageLoadTime();
		p.logo();
		
		//down casting: parent class object can be referred by child class reference variable
		//LoginPage lp1 = new Page(); NA

	}

}
