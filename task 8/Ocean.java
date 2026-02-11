class Ocean{
	
	
	static void OceanInfo(int depth,String name,int noOfSpecies,int noOfship,int noOfIsland){
		System.out.println("depth : "+depth+"\n"+"name :"+name+"species"+noOfSpecies+"\n"+"no of ships: "+noOfship+"\n"+"no of island"+noOfIsland);
		if(depth<10000){
			
			System.out.println("invalid depth");
			return;
			
		}
		if(name==null){
			System.out.println("invalid name");
			return;
			
		
		}
		if(noOfSpecies<1000){
			
			System.out.println("invalid Species");
			return;
			
		}
		if(noOfSpecies<1){
			
			System.out.println("invalid No of ships");
			return;
			
		}
		if(noOfIsland<0){
			
			System.out.println("invalid No of Island");
			return;
			
		}
		
		System.out.println("data is valid....");
		
		
	}
	
}