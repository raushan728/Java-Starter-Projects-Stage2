# Student Management System (Java)

This is a simple Java console-based student management system that allows you to add students, view all students, and delete a student by roll number. It demonstrates core Object-Oriented Programming (OOP) concepts like classes, objects, encapsulation, and exception handling.

## Features

- Add a student with roll number, name, and course
- View all students in a formatted list
- Delete a student by roll number
- Input validation and exception handling

## Requirements

- Java 8 or higher

## How to Run

1. Open Terminal or Command Prompt
   Navigate to the folder where your `StudentManagementSystem.java` file is located:
   ```bash
   cd path/to/StudentManagementSystem
   ```
2. Compile the Java file
   ```
   javac StudentManagementSystem.java
   ```
3. Run the program
   ```
   java StudentManagementSystem
   ```

## Sample Output

```
---> Menu <---
1. Add Student
2. View all Student
3. Delete Student by Roll no
4. Exit
Choose an option (1-4): 1
Enter Roll No: abc
Invalid Roll number. please enter valid details

---> Menu <---
1. Add Student
2. View all Student
3. Delete Student by Roll no
4. Exit
Choose an option (1-4): 1
Enter Roll No: 101
Enter Name: John
Enter Course: BCA
Student added successfully

---> Menu <---
1. Add Student
2. View all Student
3. Delete Student by Roll no
4. Exit
Choose an option (1-4): 2

---> Students List <---
Roll No: 101
Name: John
Course: BCA
--------------------------------

---> Menu <---
1. Add Student
2. View all Student
3. Delete Student by Roll no
4. Exit
Choose an option (1-4): 3
Enter Roll No to delete: xyz
Invalid roll number. Please enter a valid integer.
Enter Roll No to delete: 101
Student with Roll No 101 deleted

---> Menu <---
1. Add Student
2. View all Student
3. Delete Student by Roll no
4. Exit
Choose an option (1-4): 4
Exiting Student Management System.
```

## Concepts Used

- Classes and Objects
- Methods
- Encapsulation
- Exception Handling (try-catch)
- Input validation
- Loops and Menus

## Related Repositories

If you're exploring Java projects, check out:
[Java-Starter-Projects](https://github.com/raushan728/Java-Starter-Projects).
