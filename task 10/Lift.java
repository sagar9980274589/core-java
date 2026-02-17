class Lift{
	public static void main(String args[]){
		
		System.out.println(getCompany("KingfisherTower"));
		
		
	}
	
	
	static String getCompany(String buildingName){
		if(buildingName==null){
			
			return "buildingName cannot be null";
		}
		switch(buildingName){
			case "KingfisherTower":
			return "Samsung";
			case "TajHotel":
			return "Tata";
			default:
			return "Building not found";
			
			
		}
		
		
	}
	
	
}