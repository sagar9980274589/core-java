class Mobile{
	static void register(String patientName,String symptom,String email,long mobile){
		
		System.out.println("Registering done from mobile....");
		Reception.book(patientName,symptom,email,mobile);
		
	}
	
	
}