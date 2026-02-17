class Street{
	public static void main(String args[]){
		System.out.println(getLen("market street"));
		
		
	}
	static int getLen(String name){
		if(name==null){
			System.out.println("name cannot be null");
			return -1;
			
		}
		if(name=="church street"){
			return 200;
		}
		else if(name=="market street"){
			return 800;
		}
		else{
			return -1;
		}
			
	}
	
}