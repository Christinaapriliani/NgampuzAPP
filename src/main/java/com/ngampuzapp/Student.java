package com.ngampuzapp;

import java.util.List;

public class Student {
    private String studentID;
    private String studentName;
    private String department;
    private int mark;
    private double passPercentage;

    public Student(String studentID, String studentName, String department, int mark, List<Student> students) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.department = department;
        this.mark = mark;
        this.passPercentage = calculatePassPercentage(students, department);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getPassPercentage() {
        return passPercentage;
    }

    public void setPassPercentage(double passPercentage) {
        this.passPercentage = passPercentage;
    }

    public static double calculatePassPercentage(List<Student> students, String department) {
        int totalStudents = 0;
        int passStudents = 0;
        for (Student student : students) {
            if (student.getDepartment().equals(department)) {
                totalStudents++;
                if (student.getMark() >= 35) {
                    passStudents++;
                }
            }
        }
        if (totalStudents == 0) {
            return 0;
        } else {
            return (double) passStudents / totalStudents * 100;
        }
    }
}
