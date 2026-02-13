class ArrayOperation{
	static int[] nums={1,2,3,4,5};
	public static void main(String args[]){
		
		System.out.println(findMax());
		System.out.println(findMin());
		System.out.println(findAvg());
		
	}
	static int findMax(){
		int max=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		return max;
		
	}
	static int findMin(){
		int min=999;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<min){
				min=nums[i];
			}
		}
		return min;
		
	}
		static double findAvg(){
		int sum=0;
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
		}
		return sum/nums.length;
		
	}
	
	
}