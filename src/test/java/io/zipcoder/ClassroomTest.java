package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

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
    public void removeStudentTest() {
        Double[] s1Scores = { 90.0, 150.0 }; //120
        Double[] s2Scores = { 145.0, 25.0 }; //85
        Double[] s3Scores = { 105.0, 135.0 }; //120

        Student s1 = new Student("Ali", "Baba", s1Scores);
        Student s2 = new Student("Cara", "Dodo", s2Scores);
        Student s3 = new Student("Ali", "Frank", s3Scores);

        Student[] students = {s1,s2, s3};
        Classroom classroom = new Classroom(students);

        classroom.removeStudent(s3);
        Student[] expected = {s1, s2, null};
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest1() {
        Double[] s1Scores = { 90.0, 150.0 }; //120
        Double[] s2Scores = { 145.0, 25.0 }; //85

        Student s1 = new Student("Ali", "Baba", s1Scores);
        Student s2 = new Student("Cara", "Dodo", s2Scores);

        Student[] students = {s2,s1};
        Classroom classroom = new Classroom(students);

        // When
        Student[] expected = {s1, s2};
        Student[] actual = classroom.getStudentsByScore();
        Assert.assertArrayEquals(expected, actual);
    }



    @Test
    public void getStudentsByScoreTest2() {
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
    public void getStudentsByScoreTest3() {
        Double[] s1Scores = { 90.0, 150.0 }; //120
        Double[] s2Scores = { 145.0, 25.0 }; //85
        Double[] s3Scores = { 105.0, 135.0 }; //120

        Student s1 = new Student("Ali", "Baba", s1Scores);
        Student s2 = new Student("Cara", "Dodo", s2Scores);
        Student s3 = new Student("Ali", "Frank", s3Scores);

        Student[] students = {s1,s2, s3};
        Classroom classroom = new Classroom(students);

        // When
        Student[] expected = {s1, s3, s2};
        Student[] actual = classroom.getStudentsByScore();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getGradeBook() {
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };
        Double[] s3Scores = { 90.0, 150.0 }; //120
        Double[] s4Scores = { 145.0, 25.0 }; //85
        Double[] s5Scores = { 105.0, 135.0 }; //120

        Double[] s6Scores = { 110.0, 150.0 };
        Double[] s7Scores = { 215.0, 25.0 };
        Double[] s8Scores = { 91.0, 150.0 };
        Double[] s9Scores = { 115.0, 25.0 };
        Double[] s10Scores = { 115.0, 135.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("Ali", "Baba", s3Scores);
        Student s4 = new Student("Cara", "Dodo", s4Scores);
        Student s5 = new Student("Eli", "Frank", s5Scores);

        Student s6 = new Student("student", "six", s6Scores);
        Student s7 = new Student("student", "seven", s7Scores);
        Student s8 = new Student("Ellie", "Bobo", s8Scores);
        Student s9 = new Student("Tara", "Dana", s9Scores);
        Student s10 = new Student("Ali", "Fronk", s10Scores);


        Student[] students = {s1,s2, s3, s4, s5, s6, s7, s8, s9, s10};
        Classroom classroom = new Classroom(students);
        Map actual = classroom.getGradeBook();
        Assert.assertNotEquals(actual, null);
    }


}
