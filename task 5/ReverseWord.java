class 	 {

	static void displayReverse() {
		String item = "Sagar";
		String reversed = "";
		
		for(int index = item.length() - 1; index >= 0; index--) {
			reversed = reversed + item.charAt(index);
		}
		
		System.out.println(reversed);
	}
	
	public static void main(String[] args) {
		displayReverse();
	}
}
