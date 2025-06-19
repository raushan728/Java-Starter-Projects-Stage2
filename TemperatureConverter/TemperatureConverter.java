import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to Temperature Converter");

        while (keepRunning) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine();
            

            switch (choice) {
                case "1":
                    System.out.print("Enter temperature in Celsius: ");
                    String celsiusInput = scanner.nextLine();
                    try {
                        double celsius = Double.parseDouble(celsiusInput);
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        System.out.printf("Result: %.2f°C = %.2f°F\n", celsius, fahrenheit);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric value.");
                    }
                    break;

                case "2":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    String fahrenheitInput = scanner.nextLine();
                    try {
                        double fahrenheit = Double.parseDouble(fahrenheitInput);
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        System.out.printf("Result: %.2f°F = %.2f°C\n", fahrenheit, celsius);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric value.");
                    }
                    break;

                case "3":
                    keepRunning = false;
                    System.out.println("Exiting Temperature Converter. Stay cool!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
