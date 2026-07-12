package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentException, NullMarksArrayException {

        if (s == null)
            throw new NullStudentException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        int[] marks = s.getMarks();

        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }

        double avg = total / 3.0;

        if (avg >= 80)
            return "A+";
        else if (avg >= 60)
            return "A";
        else
            return "B";
    }
}