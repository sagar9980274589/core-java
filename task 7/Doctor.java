//Doctor --> treat(String name,String symptom); Nurse --> basicCheck(String atientName,String symptom,int bp,boolean sugar); Hospital--> bookAppointment(String patientName,String symptom); Reception--> book(String patientName,String symptom,String email,long mobile) Mobile --> register(String patientName,String symptom,String email,long mobile) Patient--> sick() PatientRunner Complete Feb 6 th Best Of HardWork
//Submission Instructions:

class Doctor{
	static void treat(String name,String symptom){
		
		
	System.out.println("Doctor is treating Patient :" + name + " with symptom :"+symptom);
		
	}
	
	
	
}