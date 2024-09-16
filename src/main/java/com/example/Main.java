package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        ExamDAO examDAO = new ExamDAO();

        // Add sample students
        Student john = new Student("John Doe");
        Student jane = new Student("Jane Smith");

        studentDAO.saveStudent(john);
        studentDAO.saveStudent(jane);

        // Add exams for students
        examDAO.saveExam(new Exam(john, 4));
        examDAO.saveExam(new Exam(john, 5));
        examDAO.saveExam(new Exam(jane, 3));

        // Retrieve and display all students and their exam grades
        List<Student> students = studentDAO.getAllStudents();
        for (Student student : students) {
            System.out.println("com.example.Student: " + student.getName());
            student.getExams().forEach(exam -> System.out.println(" - com.example.Exam Grade: " + exam.getGrade()));
        }
    }
}