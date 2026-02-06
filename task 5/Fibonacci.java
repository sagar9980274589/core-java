class Fibonacci{
public static void main(String[] args){
	System.out.println(Fibonnaci(7));
	
	
	
}
static int Fibonnaci(int n){
	if(n<2){
		return n;
	}
	
	return Fibonnaci(n-1)+Fibonnaci(n-2);
	
}

}