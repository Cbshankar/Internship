package org.jspApp_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private static final String FILE_NAME = "students.dat";

    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
        saveToFile();
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


