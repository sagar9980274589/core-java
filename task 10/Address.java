class Address{
	int doorNo;
	String buildingName;
    String street;
	String City;
	
	Address(int doorNo,String buildingName,String street,String City){
		
		
		this.doorNo=doorNo;
		this.buildingName=buildingName;
		this.street=street;
		this.City=City;
		
	}

	
	String getFullAddress(){
		
		return this.doorNo+this.buildingName+this.street+this.City;
		
		
		
	}


}