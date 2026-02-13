class MathStringPrograms{
	public static void main(String args[]){
		
		reverseString("sagar");
		System.out.println(checkPali("mom"));
		System.out.println(checkPali("dadi"));
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(6));
		System.out.println(factorial(3));
		System.out.println(isamstrong(153));
		System.out.println(isamstrong(154));
	}
	
	
	static void reverseString(String str){

		char[] string=str.toCharArray();
		
		for(int index=string.length-1;index>=0;index--){
			
			System.out.print(string[index]);
		}
	}
		
	static boolean checkPali(String str){

		
int len=str.length();
	int i=0,j=len-1;
	while(i<j){
		if(str.charAt(i)==str.charAt(j)){
			i++;
			j--;
		}
		else{
			return false;
		}
	}
	return true;
	}
static int fibonacci(int n){
	
if(n<=1){
	return n;
}
return fibonacci(n-1)+fibonacci(n-2);
		

	
}
static int factorial(int n){
	
if(n<=1){
	return 1;
}
return n*factorial(n-1);

	
}
static boolean isamstrong(int n){
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