import java.util.Arrays;

class Array{
	
public static void main(String args[]) {
int age1=10;
int age2=11;
String[] footBallPlayers={"a","b","c","d"};
try{
	System.out.println(footBallPlayers[3]);
System.out.println(footBallPlayers[4]);
}
catch(Exception e){
	System.out.println(e);
}

System.out.println(Arrays.toString(footBallPlayers));

}
}