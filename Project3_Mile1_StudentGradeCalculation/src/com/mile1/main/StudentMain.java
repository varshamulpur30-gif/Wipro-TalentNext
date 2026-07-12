package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        System.out.println("Student Grade Calculation Project");

        StudentService service = new StudentService();

        Student[] data = new Student[4];

        data[0] = new Student("John", new int[] {90, 80, 70});

        data[1] = new Student("David", new int[] {30, 40, 50});

        data[2] = null;

        data[3] = new Student("Riya", null);

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));

        System.out.println("Null Marks Arrays : "
                + service.findNumberOfNullMarksArray(data));
    }
}