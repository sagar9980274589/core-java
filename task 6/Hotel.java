class Hotel
{
	public static void main(String[] args){
		String items[]={"Dose","Idli","Chicken fry","Paysa","palav","poori","Vade","Fish fry","Mutton fry","watermon juice","pineapple juice","sandwich","burger","panner pizza","khulad pizza","onion pakoda","egg bonda","Dose","Idli","Chicken fry","Paysa","palav","poori","Vade","Fish fry","Mutton fry","watermon juice","pineapple juice","sandwich","burger","panner pizza","khulad pizza","onion pakoda","pineapple juice","sandwich","burger"};
		int quants[]={1,4,5,5,3,4,4,4,3,2,2,3,4,4,1,4,5,5,3,4,4,4,3,2,2,3,4,4,4,6,4,3,2,1,4};
		
		for(int i=0;i<35;i++){
			System.out.println(i+1);
			getOrder(items[i],quants[i],i%2==0);
		}
		ownerInfo(32423,23,"Sakleshpur");
		ownerInfo(3233,30,"Chikkamagalur");
        ownerInfo(24233,26,"Banglore");
	    ownerInfo(82423,40,"Hassan");
	    ownerInfo(42423,36,"Mysore");
	}
	
	
	
	
	static void getOrder(String itemName,int quantity,boolean isParcel){
		
		
		System.out.print("Order Placed for : "+itemName+" * "+quantity);
		if(isParcel){
			System.out.println(" : Take Away");
		}
		else{
			System.out.println(" : Dine in");
		}
		
	
	}
	static void  ownerInfo(long taxPaid,int age,String address){
		String ownerName="sagar";
		long gstNo=338783274837L;
		System.out.println("Owner : "+ownerName+"\n"+"Gst : "+gstNo+"\n"+"age : "+age+"\n"+"address : "+address+"\n"+"tax paid : "+taxPaid+"\n");
		
		
		
		
	}
	
	
	
	
	
}

