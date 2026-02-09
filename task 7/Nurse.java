class Nurse{
static void basicCheck(String patientName,String symptom,int bp,boolean sugar){
	
	System.out.print("Nurse did basic check bp: "+bp);
	if(sugar){
	System.out.println(" sugar: High");
	}
	else{
		System.out.println(" sugar: Normal");
		
	}
	Doctor.treat(patientName,symptom);
}




}