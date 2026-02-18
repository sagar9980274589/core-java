class ControlStatement5 {

    public static void main(String args[]) {

        boolean isOrderPlaced = true;
        boolean isOnlinePayment = false;

        if (isOrderPlaced) {
            processOrder(isOnlinePayment);
        }
    }

    static void processOrder(boolean isOnlinePayment) {

        int items = 4;
        int paymentOption = 2;
        String deliveryType = "express";

        if (isOnlinePayment) {
            onlinePayment(items, paymentOption);
        } else {
            cashOnDelivery(items, deliveryType);
        }
    }

    static void onlinePayment(int items, int paymentOption) {

        System.out.println("Online Payment Mode");

        do {
            System.out.println("Items remaining: " + items);
            items--;
        } while (items > 0);

        switch (paymentOption) {
            case 1: System.out.println("Credit Card"); break;
            case 2: System.out.println("Debit Card"); break;
            case 3: System.out.println("UPI"); break;
            default: System.out.println("Invalid Payment Option");
        }
    }

    static void cashOnDelivery(int items, String deliveryType) {

        System.out.println("Cash On Delivery Mode");

        while (items >= 0) {
            System.out.println("Items count: " + items);
            items--;
        }

        if (deliveryType.equals("standard")) {
            System.out.println("Delivery in 5 days");
        } else if (deliveryType.equals("express")) {
            System.out.println("Delivery in 2 days");
        } else {
            System.out.println("Invalid Delivery Type");
        }
    }
}
