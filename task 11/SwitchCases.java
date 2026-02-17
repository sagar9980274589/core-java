public class SwitchCases {

    public static void intSwitch() {
        int a = 4;
        switch (a) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
        }
    }

    public static void charSwitch() {
        char b = 'D';
        switch (b) {
            case 'A': System.out.println("Apple"); break;
            case 'B': System.out.println("Ball"); break;
            case 'C': System.out.println("Cat"); break;
            case 'D': System.out.println("Dog"); break;
            case 'E': System.out.println("Egg"); break;
        }
    }

    public static void stringSwitch() {
        String c = "Red";
        switch (c) {
            case "Red": System.out.println("Red Color"); break;
            case "Blue": System.out.println("Blue Color"); break;
            case "Green": System.out.println("Green Color"); break;
            case "Yellow": System.out.println("Yellow Color"); break;
            case "Black": System.out.println("Black Color"); break;
        }
    }

    public static void byteSwitch() {
        byte d = 2;
        switch (d) {
            case 1: System.out.println("Byte One"); break;
            case 2: System.out.println("Byte Two"); break;
            case 3: System.out.println("Byte Three"); break;
            case 4: System.out.println("Byte Four"); break;
            case 5: System.out.println("Byte Five"); break;
        }
    }

    public static void shortSwitch() {
        short e = 3;
        switch (e) {
            case 1: System.out.println("Short One"); break;
            case 2: System.out.println("Short Two"); break;
            case 3: System.out.println("Short Three"); break;
            case 4: System.out.println("Short Four"); break;
            case 5: System.out.println("Short Five"); break;
        }
    }

    public static void whileLoops() {

        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int j = 10;
        while (j <= 20) {
            System.out.println(j);
            j += 2;
        }

        int k = 0;
        while (k < 25) {
            System.out.println(k);
            k += 5;
        }

        int m = 100;
        while (m <= 120) {
            System.out.println(m);
            m += 4;
        }

        int n = -5;
        while (n < 0) {
            System.out.println(n);
            n++;
        }

        int a = 5;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }

        int b = 20;
        while (b >= 10) {
            System.out.println(b);
            b -= 2;
        }

        int c = 30;
        while (c > 5) {
            System.out.println(c);
            c -= 5;
        }

        int d = 50;
        while (d >= 30) {
            System.out.println(d);
            d -= 4;
        }

        int e = 0;
        while (e > -5) {
            System.out.println(e);
            e--;
        }
    }

    public static void doWhileLoops() {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        int j = 10;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 20);

        int k = 0;
        do {
            System.out.println(k);
            k += 5;
        } while (k < 25);

        int m = 100;
        do {
            System.out.println(m);
            m += 4;
        } while (m <= 120);

        int n = -5;
        do {
            System.out.println(n);
            n++;
        } while (n < 0);

        int a = 5;
        do {
            System.out.println(a);
            a--;
        } while (a >= 1);

        int b = 20;
        do {
            System.out.println(b);
            b -= 2;
        } while (b >= 10);

        int c = 30;
        do {
            System.out.println(c);
            c -= 5;
        } while (c > 5);

        int d = 50;
        do {
            System.out.println(d);
            d -= 4;
        } while (d >= 30);

        int e = 0;
        do {
            System.out.println(e);
            e--;
        } while (e > -5);
    }

    public static void main(String[] args) {

        intSwitch();
        charSwitch();
        stringSwitch();
        byteSwitch();
        shortSwitch();

        whileLoops();
        doWhileLoops();
    }
}
