class Contact{
	
	
	public static void main(String[] args){
		Address address=new Address(101,"sagar nilaya","NS palya","Btm layout");
		String[] emails={"sagar@gmail.com","madan@gmail.com"};
		long[] nums={9148342588L,9980274589L};
		
		contactInfo("sagar",emails,nums,address);
		
		
	}
	static void contactInfo(String name,String[] emails,long[] mobileNumbers,Address address){
			if(name==null){
			System.out.println("Invalid name..");
			return;
			
		}
		if(emails==null){
			System.out.println("Invalid email..");
			return;
			
		}
		if(mobileNumbers==null){
			System.out.println("Invalid Mobile number..");
			return;
			
		}
		if(address==null){
			System.out.println("Invalid Address..");
			return;
			
		}
		System.out.println("name :"+name);
		System.out.println("emails are :");
	for(String email : emails){
		System.out.println(email);
	}
	System.out.println("numbers are :");
	for(long number : mobileNumbers){
		System.out.println(number);
		
		
	}
	
	System.out.println(address.getFullAddress());
		
		System.out.println("data saved sucessfully");
		
	}
	
	
	
	
	
}