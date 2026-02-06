class Amstrong{
public static void main(String[] args){
	
	System.out.println(Amstrong(153));
	System.out.println(Amstrong(154));
	
	
}
static boolean Amstrong(int n){
	
	int count=0;
	int copy=n;
	while(copy>0){
	
		copy=copy/10;
		count++;

		
		
	}
	copy=n;
	int ans=0;
	
	while(copy>0){
		int digit=copy%10;
		copy=copy/10;
		ans+=Math.pow(digit,count);
		
	}
	return ans==n;
	
	
}


}