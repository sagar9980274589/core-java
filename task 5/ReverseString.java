class ReverseString{

public static void main(String[] args){
	
	
	reverse("sagarhd");

}
static void reverse(String name){


char[] arr = name.toCharArray();
int i = 0, j = arr.length - 1;

while (i < j) {
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
}

String reversed = new String(arr);
System.out.println(reversed); 
}

}