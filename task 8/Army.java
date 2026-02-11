class Army {

    static void saveArmy(int noOfSoldiers, int noOfElephants, int noOfHorses, String type,
                         int noOfWeapons, String commanderName, boolean commanderMarried,
                         String commanderWifeName, boolean commanderIsFather,
                         String commanderChildName, int commanderExperience) {

        System.out.println("No of Soldiers: " + noOfSoldiers);
        System.out.println("No of Elephants: " + noOfElephants);
        System.out.println("No of Horses: " + noOfHorses);
        System.out.println("Army Type: " + type);
        System.out.println("No of Weapons: " + noOfWeapons);
        System.out.println("Commander Name: " + commanderName);
        System.out.println("Commander Married: " + commanderMarried);
        System.out.println("Commander Wife Name: " + commanderWifeName);
        System.out.println("Commander is Father: " + commanderIsFather);
        System.out.println("Commander Child Name: " + commanderChildName);
        System.out.println("Commander Experience: " + commanderExperience);

      

        if (type == null) {
            System.out.println("Army type not valid.");
            return;
        }

        if (commanderName == null) {
            System.out.println("Commander name not valid.");
            return;
        }

        if (commanderWifeName == null) {
            System.out.println("Commander wife name not valid.");
            return;
        }

        if (commanderChildName == null) {
            System.out.println("Commander child name not valid.");
            return;
        }

        if (noOfSoldiers <= 400) {
            System.out.println("Army data is NOT valid.");
            return;
        }

        if (commanderExperience >= 10) {
            System.out.println("Army data is valid.");
        } else {
            System.out.println("Army data is NOT valid.");
        }

       
    }
}
