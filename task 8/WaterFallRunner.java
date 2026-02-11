class WaterFallRunner {
    public static void main(String[] args)
    {
        WaterFall.waterFallInfo("Kunchikal Falls", "shivamogga", 455, 1493);
        WaterFall.waterFallInfo("Nohkalikai Falls", "meghalaya", 340, 1115);
        WaterFall.waterFallInfo("Talakona Falls", "andhra pradesh", 270, 886);
        WaterFall.waterFallInfo("Meenmutty Falls", "kerala", 300, 984);
        WaterFall.waterFallInfo("Hebbe Falls", "chikkamagaluru", 168, 551);
    
        WaterFall.stateOwningInfo("karnataka", "shivamogga", true, true, 60);
        WaterFall.stateOwningInfo("meghalaya", "east khasi hills", true, true, 75);
        WaterFall.stateOwningInfo("andhra pradesh", "tirupati", true, true, 55);
        WaterFall.stateOwningInfo("kerala", "wayanad", true, true, 45);
        WaterFall.stateOwningInfo("karnataka", "chikkamagaluru", true, true, 35);
    }
}
