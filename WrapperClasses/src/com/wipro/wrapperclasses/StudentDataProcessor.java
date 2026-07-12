package com.wipro.wrapperclasses;

import java.util.Scanner;

public class StudentDataProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Student ID: ");
        String idStr = sc.nextLine();
        Integer studentId = Integer.valueOf(idStr); // String to Wrapper
        
        System.out.print("Enter Marks: ");
        String marksStr = sc.nextLine();
        Double marks = Double.parseDouble(marksStr); // String to Double
        
        System.out.print("Enter Grade: ");
        char grade = sc.nextLine().charAt(0);
        Character gradeChar = Character.valueOf(grade); // char to Wrapper
        
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId + " [Type: " + studentId.getClass().getSimpleName() + "]");
        System.out.println("Marks: " + marks + " [Type: " + marks.getClass().getSimpleName() + "]");
        System.out.println("Grade: " + gradeChar + " [Type: " + gradeChar.getClass().getSimpleName() + "]");
        
        // Demonstrate Autoboxing and Unboxing
        int idPrimitive = studentId; // Unboxing
        double marksPrimitive = marks; // Unboxing
        
        System.out.println("\nAfter Unboxing:");
        System.out.println("ID + 1 = " + (idPrimitive + 1));
        System.out.println("Marks + 5.5 = " + (marksPrimitive + 5.5));
        
        sc.close();
    }
}