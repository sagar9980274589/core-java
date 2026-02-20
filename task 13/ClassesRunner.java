public class ClassesRunner {
    public static void main(String[] args) {

        Bookshelf b1 = new Bookshelf();
        Bookshelf b2 = new Bookshelf();
        Bookshelf b3 = new Bookshelf();
        Bookshelf b4 = new Bookshelf();
        Bookshelf b5 = new Bookshelf();

        Refrigerator r1 = new Refrigerator();
        Refrigerator r2 = new Refrigerator();
        Refrigerator r3 = new Refrigerator();
        Refrigerator r4 = new Refrigerator();

        Bicycle bi1 = new Bicycle();
        Bicycle bi2 = new Bicycle();
        Bicycle bi3 = new Bicycle();
        Bicycle bi4 = new Bicycle();

        Backpack bp1 = new Backpack();
        Backpack bp2 = new Backpack();
        Backpack bp3 = new Backpack();
        Backpack bp4 = new Backpack();

        Television t1 = new Television();
        Television t2 = new Television();
        Television t3 = new Television();
        Television t4 = new Television();
        Television t5 = new Television();

        System.out.println(b1.material + " " + b1.shelves);
        System.out.println(b2.material + " " + b2.shelves);
        System.out.println(b3.material + " " + b3.shelves);
        System.out.println(b4.material + " " + b4.shelves);
        System.out.println(b5.material + " " + b5.shelves);

        System.out.println(r1.brand + " " + r1.capacity);
        System.out.println(r2.brand + " " + r2.capacity);
        System.out.println(r3.brand + " " + r3.capacity);
        System.out.println(r4.brand + " " + r4.capacity);

        System.out.println(bi1.type + " " + bi1.gears);
        System.out.println(bi2.type + " " + bi2.gears);
        System.out.println(bi3.type + " " + bi3.gears);
        System.out.println(bi4.type + " " + bi4.gears);

        System.out.println(bp1.color + " " + bp1.weight);
        System.out.println(bp2.color + " " + bp2.weight);
        System.out.println(bp3.color + " " + bp3.weight);
        System.out.println(bp4.color + " " + bp4.weight);

        System.out.println(t1.brand + " " + t1.size);
        System.out.println(t2.brand + " " + t2.size);
        System.out.println(t3.brand + " " + t3.size);
        System.out.println(t4.brand + " " + t4.size);
        System.out.println(t5.brand + " " + t5.size);

        b1.material = "Wood"; b1.shelves = 4;
        b2.material = "Steel"; b2.shelves = 5;
        b3.material = "Oak"; b3.shelves = 3;
        b4.material = "Pine"; b4.shelves = 6;
        b5.material = "Plastic"; b5.shelves = 2;

        r1.brand = "LG"; r1.capacity = 300;
        r2.brand = "Samsung"; r2.capacity = 350;
        r3.brand = "Whirlpool"; r3.capacity = 400;
        r4.brand = "Bosch"; r4.capacity = 450;

        bi1.type = "Mountain"; bi1.gears = 21;
        bi2.type = "Road"; bi2.gears = 18;
        bi3.type = "Hybrid"; bi3.gears = 24;
        bi4.type = "BMX"; bi4.gears = 1;

        bp1.color = "Black"; bp1.weight = 1.2;
        bp2.color = "Blue"; bp2.weight = 1.0;
        bp3.color = "Red"; bp3.weight = 1.3;
        bp4.color = "Grey"; bp4.weight = 0.9;

        t1.brand = "Sony"; t1.size = 55;
        t2.brand = "TCL"; t2.size = 50;
        t3.brand = "Philips"; t3.size = 43;
        t4.brand = "Panasonic"; t4.size = 65;
        t5.brand = "Hisense"; t5.size = 75;

        System.out.println(b1.material + " " + b1.shelves);
        System.out.println(b2.material + " " + b2.shelves);
        System.out.println(b3.material + " " + b3.shelves);
        System.out.println(b4.material + " " + b4.shelves);
        System.out.println(b5.material + " " + b5.shelves);

        System.out.println(r1.brand + " " + r1.capacity);
        System.out.println(r2.brand + " " + r2.capacity);
        System.out.println(r3.brand + " " + r3.capacity);
        System.out.println(r4.brand + " " + r4.capacity);

        System.out.println(bi1.type + " " + bi1.gears);
        System.out.println(bi2.type + " " + bi2.gears);
        System.out.println(bi3.type + " " + bi3.gears);
        System.out.println(bi4.type + " " + bi4.gears);

        System.out.println(bp1.color + " " + bp1.weight);
        System.out.println(bp2.color + " " + bp2.weight);
        System.out.println(bp3.color + " " + bp3.weight);
        System.out.println(bp4.color + " " + bp4.weight);

        System.out.println(t1.brand + " " + t1.size);
        System.out.println(t2.brand + " " + t2.size);
        System.out.println(t3.brand + " " + t3.size);
        System.out.println(t4.brand + " " + t4.size);
        System.out.println(t5.brand + " " + t5.size);
    }
}