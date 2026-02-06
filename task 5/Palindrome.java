class Palindrome{

public static void main(String[] args){
	System.out.println(isPalindrome("mom"));
	System.out.println(isPalindrome("sagar"));
	System.out.println(isPalindrome(101));
	System.out.println(isPalindrome(1011));
}

static boolean isPalindrome(String name){
	int len=name.length();
	int ptr1=0,ptr2=len-1;
	while(ptr1<ptr2){
		if(name.charAt(ptr1)==name.charAt(ptr2)){
			ptr1++;
			ptr2--;
		}
		else{
			return false;
		}
	}
	return true;
}

static boolean isPalindrome(int num){
	
    int copy=num;
	int rev=0;
	 while(copy>0){
		 int digit=copy%10;
		 rev=rev*10+digit;

		 copy/=10;
	 }
	 System.out.println(rev);
	return rev==num;
	
	
}
	


}


