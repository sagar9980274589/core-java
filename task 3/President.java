class President{
public static void main(String[] args){
	govern();
}
static void govern(){
System.out.println("govern function called");
callState();
}
static void callState(){
System.out.println("callState function called");
rules();
}
static void rules(){
System.out.println("rules function called");
check();
}
static void check(){
System.out.println("check function called");
callAdmin();
}
static void callAdmin(){
System.out.println("call Admin function called");
collect();
}
static void collect(){
System.out.println("collect function called");
apply();
}
static void apply(){
System.out.println("apply function called");
chain();
}
static void chain(){
System.out.println("chain function called");
citizen();
}
static void citizen(){
System.out.println("citizen function called");
follow();
}
static void follow(){
System.out.println("follow function called... end of functions");

}
}