# Unit Converter (Java)

This is a simple console-based Java application to convert between various units of length and weight.
It includes input validation and runs in a loop until the user chooses to exit.

## Features

- Convert Length (meters, kilometers, miles, feet, inches)
- Convert Weight (kilograms, grams, pounds, ounces)
- Input validation (non-numeric input handled gracefully)
- Loop-based menu (runs until user exits)

## Requirements

- Java 8 or higher

## How to Run

1. Open Terminal or Command Prompt
   Navigate to the folder where your file is saved:
   ```bash
   cd path/to/project-folder
   ```
2. Compile the Java file
   ```
   javac UnitConverter.java
   ```
3. Run the program
   ```
   java UnitConverter
   ```

## Sample Output

```
=== Unit Converter ===
1. Length Conversion
2. Weight Conversion
3. Exit
Enter your choice (1-3): 1

--- Length Conversion ---
1. Meters to Kilometers
2. Kilometers to Meters
3. Meters to Miles
4. Miles to Meters
5. Feet to Inches
6. Inches to Feet
Enter your choice (1-6): 1
Enter value to convert: 1500
1500.00 meters = 1.5000 kilometers

=== Unit Converter ===
1. Length Conversion
2. Weight Conversion
3. Exit
Enter your choice (1-3): 2

--- Weight Conversion ---
1. Kilograms to Grams
2. Grams to Kilograms
3. Kilograms to Pounds
4. Pounds to Kilograms
5. Ounces to Grams
6. Grams to Ounces
Enter your choice (1-6): 3
Enter value to convert: abc
Invalid input. Please enter a numeric value.

=== Unit Converter ===
1. Length Conversion
2. Weight Conversion
3. Exit
Enter your choice (1-3): 3
Exiting Unit Converter. Goodbye!
```

## Concepts Used

- Scanner class for input
- Double.parseDouble() for string-to-number conversion
- try-catch block for input validation
- while loop and switch for menu control

## Related Projects

[Java-Starter-Projects](https://github.com/raushan728/Java-Starter-Projects).

