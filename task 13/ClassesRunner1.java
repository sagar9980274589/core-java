public class ClassesRunner1 {
    public static void main(String[] args) {

        Camera c = new Camera();
        Library l = new Library();
        Smartphone s = new Smartphone();
        University u = new University();
        Supermarket sm = new Supermarket();

        System.out.println(c.brand + " " + c.megapixels + " " + c.price + " " + c.type);
        System.out.println(l.name + " " + l.city + " " + l.booksCount + " " + l.floors);
        System.out.println(s.brand + " " + s.processor + " " + s.storage + " " + s.price);
        System.out.println(u.name + " " + u.location + " " + u.students + " " + u.ranking);
        System.out.println(sm.name + " " + sm.area + " " + sm.employees + " " + sm.revenue);

        c.brand = "Canon";
		c.megapixels = 24; 
		c.price = 55000;
		c.type = "DSLR";
        l.name = "Central Library";
		l.city = "Chennai"; 
		l.booksCount = 50000; 
		l.floors = 3;
        s.brand = "Apple";
		s.processor = "A17";
		s.storage = 256; 
		s.price = 120000;
        u.name = "National University";
		u.location = "Delhi";
		u.students = 15000;
		u.ranking = 5;
        sm.name = "FreshMart";
		sm.area = "Downtown"; 
		sm.employees = 120;
		sm.revenue = 7500000;

        System.out.println(c.brand + " " + c.megapixels + " " + c.price + " " + c.type);
        System.out.println(l.name + " " + l.city + " " + l.booksCount + " " + l.floors);
        System.out.println(s.brand + " " + s.processor + " " + s.storage + " " + s.price);
        System.out.println(u.name + " " + u.location + " " + u.students + " " + u.ranking);
        System.out.println(sm.name + " " + sm.area + " " + sm.employees + " " + sm.revenue);

        c.brand = "Nikon";
		c.megapixels = 32;
		c.price = 65000;
		c.type = "Mirrorless";
        l.name = "City Library";
		l.city = "Bangalore"; 
		l.booksCount = 65000; 
		l.floors = 4;
        s.brand = "Samsung";
		s.processor = "Snapdragon 8";
		s.storage = 512; 
		s.price = 110000;
        u.name = "Global University"; 
		u.location = "Mumbai"; 
		u.students = 20000;
		u.ranking = 3;
        sm.name = "MegaStore";
		sm.area = "Uptown";
		sm.employees = 200;
		sm.revenue = 9500000;

        System.out.println(c.brand + " " + c.megapixels + " " + c.price + " " + c.type);
        System.out.println(l.name + " " + l.city + " " + l.booksCount + " " + l.floors);
        System.out.println(s.brand + " " + s.processor + " " + s.storage + " " + s.price);
        System.out.println(u.name + " " + u.location + " " + u.students + " " + u.ranking);
        System.out.println(sm.name + " " + sm.area + " " + sm.employees + " " + sm.revenue);
    }
}