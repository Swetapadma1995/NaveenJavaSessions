package OOP_Encapsulation;

//This kind of class is called POJO class
//POJO: Plain Old Java Object
public class Employee {
	
	private String name;
	private int id;
	private String city;
	private boolean isActive;
	
	//public constructor
	//In Encapsulation we can use constructor instead of setter methods
	public Employee(String name, int id, String city, boolean isActive) {
		this.name = name;
		this.id = id;
		this.city = city;
		this.isActive = isActive;
	}
	
	//public getter/setter:
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	

}
