class FMRadio{
	static boolean isRadioOn=true;
	static int volume=0;
	static String[] stations={"","","","","",""};
	static int stationPresent=0;
	static void toggleRadioState(){
		isRadioOn=!isRadioOn;
		if(isRadioOn){
			System.out.println("Switching ON !!");
		}
		else{
			System.out.println("Switching OFF !!");
		}
	}
	static void setFrequency(float frequency){
		
		if(frequency>=88 && frequency<=108){
		System.out.println("its valid .Setting frequency to :"+frequency);
		}
		else{
		System.out.println("invalid frequency !!");
		}
		
	}
	static void increaseVolume(int increment){
		
		if(increment>=0 && increment<=10){
		System.out.println("its valid .incrementing volume by  :"+increment);
		volume+=increment;
	 System.out.println("new volume:"+volume);
		}
		else{
		System.out.println("invalid increment !!");
		}
		
	}
	static void decreaseVolume(int decrement){
		
		if(decrement>=0 && decrement<=10){
System.out.println("its valid .decrementing volume by  :"+decrement);
		volume-=decrement;
		if(volume<0){
			volume=0;
			System.out.println("volume set to 0 because of over decrement");
		}
	 System.out.println("new volume:"+volume);
		}
		else{
		System.out.println("invalid decrement !!");
		}
		
	}
	static void saveStation(String station){
		if(station==null){
		System.out.println("station cant be null !!");	
		}
			
		if(stationPresent<=stations.length-1){
			stations[stationPresent]=station;
			stationPresent++;
			System.out.println("station added sucessfully.. stations are !!");
			for(String substation:stations){
				System.out.println(substation);	
			}
		}
		else{
			System.out.println("sorry store full.. stations are only !!"+stations.length+" stations are allowed");
			for(String substation:stations){
				System.out.println(substation);	
			}
		}
	}
	
}