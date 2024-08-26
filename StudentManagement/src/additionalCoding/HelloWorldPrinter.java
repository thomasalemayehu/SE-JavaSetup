package additionalCoding;

public class HelloWorldPrinter {

    public static void main(String[] args) {
        int[] numbers = {10, 14, 35, 49, 50, 70, 28, 100};
        printHelloWorld(numbers);
    }

    public static void printHelloWorld(int[] numbers) {

        for (int number : numbers) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("HelloWorld");
            } else if (number % 5 == 0) {
                System.out.println("Hello");
            } else if (number % 7 == 0) {
                System.out.println("World");
            }
        }
    }
}
