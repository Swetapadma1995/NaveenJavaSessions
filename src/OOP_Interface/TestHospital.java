package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.pediaServices();
		fh.gynoServices();
		fh.pediaServices();
		fh.emergencyServices();
		
		fh.medicalInsurance();
		fh.medicalTraining();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		USMedical.billing();
		//FortisHospital.billing();
		
		fh.medicalNewsPublish();
		fh.covidVaccination();
		
		//top-casting: child class object can be referred by parent interface reference variable
		
		//can't create object of interface
		//USMedical us = new USMedical(); 
		
		USMedical us = new FortisHospital();
		
		us.pediaServices();
		us.oncologyServices();
		us.physioServices();
		us.emergencyServices();
		
		UKMedical uk = new FortisHospital();
		
		uk.dentalServices();
		uk.orthoServices();
		uk.emergencyServices();
		
		//down - casting: can't use down casting interface
		//FortisHospital fh1 = new USMedical();
	}

}
