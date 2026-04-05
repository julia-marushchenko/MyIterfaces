/**
 *  Java program to demonstrate usage of interfaces.
 */

package com.myinterface;

/**
 *  Main class with JVM entry point.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating Student instance.
        StudentImpl student = new StudentImpl();

        // Marks of student.
        double[] marks = new double[] {99, 78.5, 88, 95,6, 97};

        // Calling method and printing the result to console.
        StudentImpl st = new StudentImpl();
       System.out.println("Average mark is: " + st.getMarks(marks));

    }
}

// Student interface.
interface Student {

    // Method to return average value of marks.
    public double getMarks(double[] marks);

}

class StudentImpl implements Student {


    public double getMarks(double[] marks) {

        // Initializing sum of marks.
        double sum = 0;

        // Finding average mark.
        for (double elements : marks) {
            sum += elements;
        }

        // Average mark.
        double average = sum / marks.length;

        return average;
    }

}
