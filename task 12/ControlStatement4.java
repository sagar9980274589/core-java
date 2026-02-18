class ControlStatement4 {

    public static void main(String args[]) {

        boolean isGameOn = true;
        boolean isMultiplayer = true;

        if (isGameOn) {
            startGame(isMultiplayer);
        }
    }

    static void startGame(boolean isMultiplayer) {

        int lives = 3;
        int stage = 4;
        String difficulty = "hard";

        if (isMultiplayer) {
            multiplayerMode(lives, stage);
        } else {
            singlePlayerMode(lives, difficulty);
        }
    }

    static void multiplayerMode(int lives, int stage) {

        System.out.println("Multiplayer Mode Started");

        do {
            System.out.println("Lives left: " + lives);
            lives--;
        } while (lives > 0);

        switch (stage) {
            case 1: System.out.println("Forest Stage"); break;
            case 2: System.out.println("Desert Stage"); break;
            case 3: System.out.println("Ocean Stage"); break;
            case 4: System.out.println("Mountain Stage"); break;
            default: System.out.println("Invalid Stage");
        }
    }

    static void singlePlayerMode(int lives, String difficulty) {

        System.out.println("Single Player Mode");

        while (lives >= 0) {
            System.out.println("Life count: " + lives);
            lives--;
        }

        if (difficulty.equals("easy")) {
            System.out.println("Easy Mode Selected");
        } else if (difficulty.equals("medium")) {
            System.out.println("Medium Mode Selected");
        } else if (difficulty.equals("hard")) {
            System.out.println("Hard Mode Selected");
        } else {
            System.out.println("Invalid Difficulty");
        }
    }
}
