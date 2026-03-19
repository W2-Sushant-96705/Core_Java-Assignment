package com.subeam.student;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Student implements Serializable {

    public static final long serialVersionUID = 1L;

    private int rollno;
    private String name;
    private double marks;
    private double totalmarks = 200;

    public Student() {}

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() { return rollno; }
    public void setRollno(int rollno) { this.rollno = rollno; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    public double getPercent() {
        return (marks / totalmarks) * 100;
    }

    @Override
    public String toString() {
        return "\nStudent [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return rollno == other.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    public void acceptStudent(Scanner sc) {
        System.out.println("Enter RollNo: ");
        rollno = sc.nextInt();

        System.out.println("Enter Name: ");
        name = sc.next();

        System.out.println("Enter Marks: ");
        marks = sc.nextDouble();
    }
}