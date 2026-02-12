class Restaurant{
	public static void main(String[] args){
		String[] ingreds={"mushroom","rice","water","oil","chilli powder","salt"};
		foodDish("Mushroom Biryani",ingreds);
		
		
	}
	
	
	static void foodDish(String name,String[] ingredents){
		if(name==null){
			System.out.println("invalid name...");
			return;
			
		}
		if(ingredents==null){
			System.out.println("invalid ingredents...");
			return;
			
		}
		System.out.println("name :"+name);
		System.out.println("Ingredients used are ....");
		for(String item : ingredents){
			System.out.println(item);
		}
		
		System.out.println("data saved....");
		
	}
	
	
	
	
	
}