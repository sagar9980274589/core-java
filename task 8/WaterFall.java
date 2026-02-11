class WaterFall {

    static void waterFallInfo(String name, String riverName, int width, int altitude)
    {
        System.out.println("Name of the waterfall: " + name);
        System.out.println("River name: " + riverName);
        System.out.println("Width in meters: " + width);
        System.out.println("Altitude in feet: " + altitude);

      

        if (name == null) {
            System.out.println("Waterfall name not valid.");
            return;
        }

        if (riverName == null) {
            System.out.println("River name not valid.");
            return;
        }

        if (width <= 0) {
            System.out.println("Width not valid.");
            return;
        }

        if (altitude <= 0) {
            System.out.println("Altitude not valid.");
            return;
        }

        System.out.println("Waterfall data is valid.");
       
    }

    static void stateOwningInfo(String state, String nearbyTown, boolean hasParking,
                                boolean hasGuideService, int ticketPrice)
    {
        System.out.println("State: " + state);
        System.out.println("Nearby Town: " + nearbyTown);
        System.out.println("Parking Available: " + hasParking);
        System.out.println("Guide Service Available: " + hasGuideService);
        System.out.println("Ticket Price: " + ticketPrice);

      

        if (state == null) {
            System.out.println("State not valid.");
            return;
        }

        if (nearbyTown == null) {
            System.out.println("Nearby town not valid.");
            return;
        }

        if (ticketPrice < 0) {
            System.out.println("Ticket price not valid.");
            return;
        }

        System.out.println("State information is valid.");
        
    }
}
