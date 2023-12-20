package OOP_Interface;

public class FortisHospital extends Medical implements USMedical , UKMedical , IndiaMedical {

	static final int min_fee = 50;
	
	//USMedical
	@Override
	public void physioServices() {
		System.out.println("FH--physioServices");	
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH--oncologyServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH--pediaServices");
	}

	//UKMedical
	@Override
	public void dentalServices() {
		System.out.println("FH--dentalServices");		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH--orthoServices");		
	}
	
	//IndiaMedical
	@Override
	public void gynoServices() {
		System.out.println("FH--gynoServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("FH--ENTServices");
	}

	//common method for all interfaces:
	@Override
	public void emergencyServices() {
		System.out.println("FH--emergencyServices");
	}
	
	//individual method:
	public void medicalInsurance() {
		System.out.println("FH--medicalInsurance");
	}
	
	public void medicalTraining() {
		System.out.println("FH--medicalTraining");
	}
	
	//method hiding
	//public static void billing() {
		//buss logic
		//System.out.println("US--billing");
	//}
	
	@Override
	public void RnD() {
		System.out.println("FH--R&D");
	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH--covidVaccination");
		
	}

}
