package com.subeam.student;

import java.io.*;
import java.util.*;

public class SchoolTest {

    public static void savestu(List<Student> stulist) {
        try (FileOutputStream fos = new FileOutputStream("student.db");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(stulist);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> loadstu() {
        try (FileInputStream fis = new FileInputStream("student.db");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (List<Student>) ois.readObject();

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        List<Student> stulist = loadstu(); // FIX: load saved data
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("===========================");
            System.out.println("\n---School Details---");
            System.out.println("1. Add a Student.");
            System.out.println("2. Display all Students.");
            System.out.println("3. Find Student by RollNo.");
            System.out.println("4. Delete Student by RollNo");
            System.out.println("5. Sort by RollNo (Asc)");
            System.out.println("6. Sort by Name (Asc)");
            System.out.println("7. Sort by Marks (Desc)");
            System.out.println("8. Display Percentage");
            System.out.println("0. EXIT.");
            System.out.println("===========================");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Student s1 = new Student();
                    s1.acceptStudent(sc);
                    stulist.add(s1);
                    break;

                case 2:
                    for (Student s : stulist)
                        System.out.println(s);
                    break;

                case 3:
                    System.out.print("Enter RollNo: ");
                    int rno = sc.nextInt();

                    for (Student s : stulist) {
                        if (s.getRollno() == rno)
                            System.out.println(s);
                    }
                    break;

                case 4:
                    System.out.print("Enter RollNo to delete: ");
                    int del = sc.nextInt();

                    stulist.removeIf(s -> s.getRollno() == del); // FIX
                    break;

                case 5:
                    Collections.sort(stulist, (a, b) -> a.getRollno() - b.getRollno()); // FIX
                    for (Student s : stulist)
                        System.out.println(s);
                    break;

                case 6:
                    Collections.sort(stulist, (a, b) -> a.getName().compareTo(b.getName()));
                    for (Student s : stulist)
                        System.out.println(s);
                    break;

                case 7:
                    Collections.sort(stulist, (a, b) -> (int) (b.getMarks() - a.getMarks())); // FIX
                    for (Student s : stulist)
                        System.out.println(s);
                    break;

                case 8:
                    for (Student s : stulist) {
                        System.out.println("Roll: " + s.getRollno()
                                + " Name: " + s.getName()
                                + " Marks: " + s.getMarks()
                                + " %: " + s.getPercent());
                    }
                    break;

                case 0:
                    savestu(stulist); // SAVE before exit
                    System.out.println("Data Saved!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0); // FIX: correct loop

        sc.close();
    }
}