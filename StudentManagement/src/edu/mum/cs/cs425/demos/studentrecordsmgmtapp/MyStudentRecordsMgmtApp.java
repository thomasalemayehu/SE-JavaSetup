package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {

    public static void main(String[] args) {
        // Create an array of Students using the provided sample data
        Student[] students = new Student[]{
                new Student(110001, "John", LocalDate.of(1951, 11, 18)),
                new Student(110002, "Doe", LocalDate.of(1990, 12, 7)),
                new Student(110003, "Jane", LocalDate.of(1974, 1, 31)),
                new Student(110004, "Erica", LocalDate.of(2009, 8, 22)),
                new Student(110005, "Java", LocalDate.of(1990, 3, 5))
        };


        printListOfStudents(students);

        List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);
        System.out.println("\nPlatinum Alumni Students:");
        platinumAlumniStudents.forEach(System.out::println);
    }


    public static void printListOfStudents(Student[] students) {

        Arrays.sort(students, Comparator.comparing(Student::getName));
        System.out.println("List of Students (sorted by name):");
        for (Student student : students) {
            System.out.println(student);
        }
    }


    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {

        LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
        return Arrays.stream(students)
                .filter(student -> student.getDateOfAdmission().isBefore(thirtyYearsAgo))
                .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
                .collect(Collectors.toList());
    }
}
