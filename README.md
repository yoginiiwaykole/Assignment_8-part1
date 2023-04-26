# Assignment_8-part1

ExceptionDemo
This program calculates the factorial of a given integer using the factorial method. If the given integer is less than 0 or greater than 15, a custom FactorialException is thrown.

The main method takes arguments from the command line, attempts to parse them into integers, and then calculates the factorial using the factorial method. If the argument is not a valid integer, a NumberFormatException is caught and a message is printed. If the factorial calculation throws a FactorialException, the exception is caught and an error message is printed.

Usage
To run the program, compile the ExceptionDemo class and run it with any number of integer arguments:

javac ExceptionDemo.java
java ExceptionDemo 5 10 20 -1 abc 15

This will calculate the factorials of 5, 10, 20, and 15, print an error message for -1 and abc, and exit.
