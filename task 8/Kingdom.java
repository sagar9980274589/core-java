class Kingdom {

    static void save(boolean king, String name, String kingdomName, String queenName,
                     String princessName, int populationOfKingdom, String territory,
                     int yearOfBirth, int yearOfDeath, int armySize, int yearsRuled)
    {

        System.out.println("King Status: " + king);
        System.out.println("King Name: " + name);
        System.out.println("Kingdom Name: " + kingdomName);
        System.out.println("Queen Name: " + queenName);
        System.out.println("Princess Name: " + princessName);
        System.out.println("Population: " + populationOfKingdom);
        System.out.println("Territory: " + territory);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Year of Death: " + yearOfDeath);
        System.out.println("Army Size: " + armySize);
        System.out.println("Years Ruled: " + yearsRuled);

     

        if (name == null) {
            System.out.println("King name not valid.");
            return;
        }

        if (kingdomName == null) {
            System.out.println("Kingdom name not valid.");
            return;
        }

        if (queenName == null) {
            System.out.println("Queen name not valid.");
            return;
        }

        if (princessName == null) {
            System.out.println("Princess name not valid.");
            return;
        }

        if (territory == null) {
            System.out.println("Territory not valid.");
            return;
        }

        if (king) {
            System.out.println("He is a King.");
        } else {
            System.out.println("He is not a King.");
        }

        System.out.println("All data is valid.");
       
    }
}
