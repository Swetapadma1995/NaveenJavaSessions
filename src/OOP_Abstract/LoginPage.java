package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login page constructor");
	}

	public LoginPage(int a) {
		super(a);
		System.out.println("Login page constructor " + a);
	}

	
	@Override
	public void title() {
		System.out.println("LP - page");		
	}

	@Override
	public void url() {
		System.out.println("LP - url");	
	}
	
	@Override
	public void pageLoadTime() {
		System.out.println("Page load time out = 2 sec");
	}
	
	public void doLogin(String un ,  String pswd) {
		System.out.println("Logged in user with "+ un + " "+ pswd);
	}

}
