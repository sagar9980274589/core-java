class Reception{
static void book(String patientName,String symptom,String email,long mobile){
	
	System.out.println("Receptionist Booking done !!");
	
	
	Hospital.bookAppointment(patientName,symptom);
}


}