class ReverseArray{

public static void main(String[] args){
	int arr[]={1,2,3,4};
	reverseArray(arr);
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
	
	
}
static void reverseArray(int[] arr){
	
	int len=arr.length;
	int ptr1=0;
	int ptr2=len-1;
	
	while(ptr1<ptr2){
		
		int temp=arr[ptr1];
		arr[ptr1]=arr[ptr2];
		arr[ptr2]=temp;
		ptr1++;
		ptr2--;
		
	}
	
	
	
	
}




}