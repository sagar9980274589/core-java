public class Bird {

    public static String getColorByName(String name) {

        if (name.equals("Parrot")) return "Green";
        else if (name.equals("Sparrow")) return "Brown";
        else if (name.equals("Peacock")) return "Blue and Green";
        else if (name.equals("Crow")) return "Black";
        else if (name.equals("Pigeon")) return "Grey";
        else if (name.equals("Flamingo")) return "Pink";
        else if (name.equals("Eagle")) return "Dark Brown";
        else if (name.equals("Owl")) return "Brown and White";
        else if (name.equals("Kingfisher")) return "Blue";
        else if (name.equals("Canary")) return "Yellow";
        else if (name.equals("Woodpecker")) return "Red and Black";
        else if (name.equals("Duck")) return "White";
        else if (name.equals("Swan")) return "White";
        else if (name.equals("Robin")) return "Orange and Brown";
        else if (name.equals("Penguin")) return "Black and White";
        else if (name.equals("Macaw")) return "Multicolor";
        else if (name.equals("Falcon")) return "Grey";
        else if (name.equals("Hummingbird")) return "Green and Red";
        else if (name.equals("Ostrich")) return "Black";
        else if (name.equals("Kite")) return "Brown";
        else return "Color not found";
    }

    public static int getLifeSpan(String name) {

        if (name.equals("Parrot")) return 20;
        else if (name.equals("Sparrow")) return 3;
        else if (name.equals("Peacock")) return 15;
        else if (name.equals("Crow")) return 10;
        else if (name.equals("Pigeon")) return 6;
        else if (name.equals("Flamingo")) return 25;
        else if (name.equals("Eagle")) return 28;
        else if (name.equals("Owl")) return 12;
        else if (name.equals("Kingfisher")) return 7;
        else if (name.equals("Canary")) return 10;
        else if (name.equals("Woodpecker")) return 11;
        else if (name.equals("Duck")) return 8;
        else if (name.equals("Swan")) return 20;
        else if (name.equals("Robin")) return 5;
        else if (name.equals("Penguin")) return 20;
        else if (name.equals("Macaw")) return 30;
        else if (name.equals("Falcon")) return 15;
        else if (name.equals("Hummingbird")) return 5;
        else if (name.equals("Ostrich")) return 40;
        else if (name.equals("Kite")) return 14;
        else return 0;
    }

    public static void main(String[] args) {

        String[] birds = {
            "Parrot","Sparrow","Peacock","Crow","Pigeon",
            "Flamingo","Eagle","Owl","Kingfisher","Canary",
            "Woodpecker","Duck","Swan","Robin","Penguin",
            "Macaw","Falcon","Hummingbird","Ostrich","Kite"
        };

        for (int i = 0; i < birds.length; i++) {
            System.out.println("Bird: " + birds[i]);
            System.out.println("Color: " + getColorByName(birds[i]));
            System.out.println("Life Span: " + getLifeSpan(birds[i]) + " years");
      
        }
    }
}
