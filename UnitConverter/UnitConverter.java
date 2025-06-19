import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    lengthConversion(scanner);
                    break;
                case "2":
                    weightConversion(scanner);
                    break;
                case "3":
                    System.out.println("Exiting Unit Converter. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private static void lengthConversion(Scanner scanner) {
        System.out.println("\n--- Length Conversion ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Meters to Miles");
        System.out.println("4. Miles to Meters");
        System.out.println("5. Feet to Inches");
        System.out.println("6. Inches to Feet");
        System.out.print("Enter your choice (1-6): ");
        String option = scanner.nextLine();

        double inputValue = 0;
        try {
            System.out.print("Enter value to convert: ");
            inputValue = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return;
        }

        double result = 0;
        switch (option) {
            case "1":
                result = inputValue / 1000;
                System.out.printf("%.2f meters = %.4f kilometers\n", inputValue, result);
                break;
            case "2":
                result = inputValue * 1000;
                System.out.printf("%.2f kilometers = %.2f meters\n", inputValue, result);
                break;
            case "3":
                result = inputValue * 0.000621371;
                System.out.printf("%.2f meters = %.4f miles\n", inputValue, result);
                break;
            case "4":
                result = inputValue / 0.000621371;
                System.out.printf("%.2f miles = %.2f meters\n", inputValue, result);
                break;
            case "5":
                result = inputValue * 12;
                System.out.printf("%.2f feet = %.2f inches\n", inputValue, result);
                break;
            case "6":
                result = inputValue / 12;
                System.out.printf("%.2f inches = %.2f feet\n", inputValue, result);
                break;
            default:
                System.out.println("Invalid option. Please select from 1 to 6.");
        }
    }

    private static void weightConversion(Scanner scanner) {
        System.out.println("\n--- Weight Conversion ---");
        System.out.println("1. Kilograms to Grams");
        System.out.println("2. Grams to Kilograms");
        System.out.println("3. Kilograms to Pounds");
        System.out.println("4. Pounds to Kilograms");
        System.out.println("5. Ounces to Grams");
        System.out.println("6. Grams to Ounces");
        System.out.print("Enter your choice (1-6): ");
        String option = scanner.nextLine();

        double inputValue = 0;
        try {
            System.out.print("Enter value to convert: ");
            inputValue = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return;
        }

        double result = 0;
        switch (option) {
            case "1":
                result = inputValue * 1000;
                System.out.printf("%.2f kg = %.2f grams\n", inputValue, result);
                break;
            case "2":
                result = inputValue / 1000;
                System.out.printf("%.2f grams = %.4f kg\n", inputValue, result);
                break;
            case "3":
                result = inputValue * 2.20462;
                System.out.printf("%.2f kg = %.4f pounds\n", inputValue, result);
                break;
            case "4":
                result = inputValue / 2.20462;
                System.out.printf("%.2f pounds = %.4f kg\n", inputValue, result);
                break;
            case "5":
                result = inputValue * 28.3495;
                System.out.printf("%.2f ounces = %.2f grams\n", inputValue, result);
                break;
            case "6":
                result = inputValue / 28.3495;
                System.out.printf("%.2f grams = %.4f ounces\n", inputValue, result);
                break;
            default:
                System.out.println("Invalid option. Please select from 1 to 6.");
        }
    }
}
