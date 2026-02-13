class CricketWorldCupRunner{

public static void main(String[] args){
	System.out.println("\ncalling register team ---------------------\n\n");
	CricketWorldCup.registerTeam("INDIA","Sagar",2,true,11);
	CricketWorldCup.registerTeam("Australia","Sagar",2,false,11);
	CricketWorldCup.registerTeam(null,"Sagar",2,true,11);
	System.out.println("\n\ncalling save team ---------------------\n\n");
	CricketWorldCup.saveMatch(4,"india","australia","Chinnaswamy","Banglore","13-02-2026","12:30 PM",50,true,"sagar","chaturth");
	CricketWorldCup.saveMatch(4,"india","australia","Chinnaswamy","Banglore","13-02-2026","12:30 PM",50,false,"sagar","chaturth");
	CricketWorldCup.saveMatch(4,null,"australia","Chinnaswamy","Banglore","13-02-2026","12:30 PM",50,true,"sagar","chaturth");
	System.out.println("\n\ncalling save player ---------------------\n\n");
	CricketWorldCup.savePlayer("sagar","india",24,"All rounder",true,false,20,600,15,30.2,5);
	CricketWorldCup.savePlayer("sagar","india",24,"All rounder",false,false,20,600,15,30.2,5);
	CricketWorldCup.savePlayer(null,"india",24,"All rounder",false,false,20,600,15,30.2,5);
	System.out.println("\n\ncalling calculate run rate ---------------------\n\n");
	System.out.println("Net run rate :"+CricketWorldCup.calculateRunRate(30,6,2));
	System.out.println("\n\ncalling check qualification ---------------------\n\n");
	CricketWorldCup.checkQualification(15,45,2);
	System.out.println("\n\ncalling man of the match ---------------------\n\n");
	CricketWorldCup.manOfTheMatch("sagar",102,2);
	CricketWorldCup.manOfTheMatch("sagar",-39,2);
}

}