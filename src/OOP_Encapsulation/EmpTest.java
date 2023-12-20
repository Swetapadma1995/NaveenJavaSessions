package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		
	//Employee e = new Employee();
	//e.setName("Sanghghita");
	//	e.setId(1);
	//	e.setCity("Odisha");
	//e.setActive(true);
		
		//
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.isActive());
		
		//CRUD: CREATE , RETRIVE , UPDATE , DELETE
		
		//User Registration: we can do by setter or constructor... CREATE: POST API
		Employee e = new Employee("Sangita" , 1 , "Odisha" , true);
		
		//display info on user profile: using getter... RETRIEVE: GET APT
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isActive());
		
		//user wants to update the city and name:  using setter...UPDATE: PUT/PATCH API
		e.setName("Sangita Das");
		e.setCity("Bangalore");
		
		//display info on user profile:  using getter...  RETRIEVE: GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isActive());
		
		
		
	}

}
