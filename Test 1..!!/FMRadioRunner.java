class FMRadioRunner{
	public static void main(String ags[]){
		FMRadio.toggleRadioState();
		FMRadio.toggleRadioState();
		FMRadio.toggleRadioState();
		FMRadio.setFrequency(99.2F);
		FMRadio.setFrequency(30);
		FMRadio.setFrequency(200);
		FMRadio.increaseVolume(10);
		FMRadio.decreaseVolume(5);
		FMRadio.decreaseVolume(13);
		FMRadio.decreaseVolume(6);
		FMRadio.saveStation("hassan");
		FMRadio.saveStation("mysore");
		FMRadio.saveStation("banglore");
		FMRadio.saveStation("sakleshpur");
		FMRadio.saveStation("coorg");
		FMRadio.saveStation("manglore");
		FMRadio.saveStation("bidar");
	}
}