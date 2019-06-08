package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageExamScore() {
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double actual = classroom.getAverageExamScore();
        double expected = 125.0;
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void addStudentTest() {
        //Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
    }

    @Test
    public void removeStudent() {
        //Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);
    }

    @Test
    public void getStudentsByScore() {
        Double[] s1Scores = { 90.0, 150.0 }; //120
        Double[] s2Scores = { 145.0, 25.0 }; //85
        Double[] s3Scores = { 105.0, 135.0 }; //120

        Student s1 = new Student("Ali", "Baba", s1Scores);
        Student s2 = new Student("Cara", "Dodo", s2Scores);
        Student s3 = new Student("Eli", "Frank", s3Scores);

        Student[] students = {s1,s2, s3};
        Classroom classroom = new Classroom(students);

        // When
        Student[] expected = {s1, s3, s2};
        Student[] actual = classroom.getStudentsByScore();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getGradeBook() {
    }
}
