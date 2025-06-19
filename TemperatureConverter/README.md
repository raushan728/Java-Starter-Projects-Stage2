# 🌡️ Temperature Converter (Java)

This is a simple console-based Java application to convert temperatures between Celsius and Fahrenheit.  
It includes input validation and runs in a loop until the user chooses to exit.

---

## 📌 Features

- Convert **Celsius to Fahrenheit**
- Convert **Fahrenheit to Celsius**
- Input validation (non-numeric input handled gracefully)
- Loop-based menu (runs until user exits)

---

## 🛠️ Requirements

- Java 8 or higher  
 ✅ You are using: `Java 23.0.1`

---

## 🚀 How to Run

1. **Open Terminal or Command Prompt**  
   Navigate to the folder where your file is saved:
   ```bash
   cd path/to/project-folder
   ```
2. **Compile the Java file**
   ```
   javac TemperatureConverter.java
   ```
3. **Run the program**
   ```
   java TemperatureConverter
   ```
   ---
   ## 💡 Sample Output
```
  Welcome to Temperature Converter

  Choose an option:
  1. Convert Celsius to Fahrenheit
  2. Convert Fahrenheit to Celsius
  3. Exit
  Enter your choice (1-3): 1
  Enter temperature in Celsius: 37
  Result: 37.00°C = 98.60°F

  Choose an option:
  1. Convert Celsius to Fahrenheit
  2. Convert Fahrenheit to Celsius
  3. Exit
  Enter your choice (1-3): 2
  Enter temperature in Fahrenheit: abc
  Invalid input. Please enter a numeric value.

  Choose an option:
  1. Convert Celsius to Fahrenheit
  2. Convert Fahrenheit to Celsius
  3. Exit
  Enter your choice (1-3): 3
  Exiting Temperature Converter. Stay cool!
  ```
---

## 🧠 Concepts Used
- Scanner class for input

- Double.parseDouble() for string-to-number conversion

- try-catch block for input validation

- while loop and switch for menu control

---

## 🔗 Related Projects
👉 [Java-Starter-Projects](https://github.com/raushan728/Java-Starter-Projects).