Student Management System
=========================

This is a Java-based Student Management System with a command-line interface (CLI) designed to manage student records. The application allows users to add new students, update grades, and view a list of all students. Data persistence is achieved through file handling, where student information is stored in a text file.

Features
--------

*   **Add New Student**: Input a student's ID, name, and grade.
    
*   **Update Student Grade**: Modify the grade of an existing student.
    
*   **View All Students**: Display all stored student information in a readable format.
    

Technologies Used
-----------------

*   **Java**: Core programming language for object-oriented structure.
    
*   **File Handling**: To store and retrieve student data from students.txt.
    

How to Run
----------

1.  Navigate to the Code\_Files directory and run:bashCopy codejavac \*.java
    
2.  Start the CLI application with:bashCopy codejava CLIThe program will display a menu with the following options:
    
    *   Press **1** to add a new student.
        
    *   Press **2** to update a student's grade.
        
    *   Press **3** to view all students.
        
    *   Press **4** to exit the program.
        

File Structure
--------------

*   **Student.java**: Defines the Student class with ID, name, and grade attributes.
    
*   **FileHandler.java**: Manages saving and loading student data from students.txt.
    
*   **CLI.java**: Provides the command-line interface for user interaction.