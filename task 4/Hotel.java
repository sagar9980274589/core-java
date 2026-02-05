class Hotel {

    static void storeUtensils() {
        String u1 = "plate";
        String u2 = "spoon";
        String u3 = "fork";
        String u4 = "cup";

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
    }

    static void storeStaffs() {
        String s1 = "manager";
        String s2 = "supplier";
        String s3 = "cleaner";
        String s4 = "attender";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    static void storeHotelInfo() {
        String hotelName = "Malnad Hotel";
        String location = "Madhanuru";

        System.out.println("Hotelname: " + hotelName);
        System.out.println("Location: " + location);
    }

    static void storeMenu() {
        String m1 = "chicken";
        String m2 = "mutton";
        String m3 = "fish";
        String m4 = "veg";

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    public static void main(String[] args) {
        storeUtensils();
        storeStaffs();
        storeHotelInfo();
        storeMenu();
    }
}