class ControlStatement3 {

    public static void main(String args[]) {

        boolean isActive = true;
        boolean isPremium = false;

        if (isActive) {
            checkUser(isPremium);
        }
    }

    static void checkUser(boolean isPremium) {

        int attempts = 3;
        int level = 2;
        String role = "admin";

        if (isPremium) {
            premiumAccess(attempts, level);
        } else {
            normalAccess(attempts, role);
        }
    }

    static void premiumAccess(int attempts, int level) {

        System.out.println("Premium Access Granted");

        do {
            System.out.println("Attempts left: " + attempts);
            attempts--;
        } while (attempts > 0);

        switch (level) {
            case 1: System.out.println("Level 1 User"); break;
            case 2: System.out.println("Level 2 User"); break;
            case 3: System.out.println("Level 3 User"); break;
            default: System.out.println("Invalid Level");
        }
    }

    static void normalAccess(int attempts, String role) {

        System.out.println("Normal Access Mode");

        while (attempts >= 0) {
            System.out.println("Remaining: " + attempts);
            attempts--;
        }

        if (role.equals("admin")) {
            System.out.println("Role ID: 101");
        } else if (role.equals("user")) {
            System.out.println("Role ID: 102");
        } else {
            System.out.println("Unknown Role");
        }
    }
}
