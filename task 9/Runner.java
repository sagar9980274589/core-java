public class Runner {

    public static void main(String[] args) {

        Calculator.add(10, 5);
        Calculator.add(5.5, 4.5);

        Printer.print("Java");
        Printer.print(200);

        Rectangle.area(4, 7);
        Rectangle.area(6);

        Greeter.greet();
        Greeter.greet("Sam");

        Converter.convert("30");
        Converter.convert(8.9);
    }
}
