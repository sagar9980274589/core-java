class LaptopStore {

    public static void main(String[] args) {

        String[] ports = {"USB-C", "HDMI", "USB-A", "3.5mm Jack"};
        String[] countriesOfWarranty = {"India", "USA", "Germany"};

        laptop("Dell", "XPS 13", ports, countriesOfWarranty);
    }

    static void laptop(String brand, String model, 
                       String[] ports, String[] countriesOfWarranty) {

        if (brand == null) {
            System.out.println("Invalid brand...");
            return;
        }

        if (model == null) {
            System.out.println("Invalid model...");
            return;
        }

        if (ports == null) {
            System.out.println("Invalid ports...");
            return;
        }

        if (countriesOfWarranty == null) {
            System.out.println("Invalid warranty countries...");
            return;
        }

        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);

        System.out.println("Available Ports:");
        for (String port : ports) {
            System.out.println(port);
        }

        System.out.println("Warranty Valid In:");
        for (String country : countriesOfWarranty) {
            System.out.println(country);
        }

        System.out.println("Laptop data saved...");
    }
}
