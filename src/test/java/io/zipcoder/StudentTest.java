package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {


    @Test
    public void StudentTest(){
        Double[] examScores = {95.0, 85.0, 99.0};
        String firstName = "Ben";
        String lastName = "Cabana";
        Student student = new Student(firstName, lastName, examScores);

        String firstNameActual = student.getFirstName();
        String lastNameActual = student.getLastName();
        Double[] examScoresActual = student.getExamScoresArray();

        Assert.assertEquals(firstName,firstNameActual);
        Assert.assertEquals(lastName, lastNameActual);
        Assert.assertEquals(examScores, examScoresActual);
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        Double[] examScores = {95.0, 85.0, 99.0};
        String firstName = "Ben";
        String lastName = "Cabana";
        Student student = new Student(firstName, lastName, examScores);

        Integer expected = 3;
        Integer actual = student.getNumberOfExamsTaken();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExamScoresArrayTest() {
    }

    @Test
    public void getAverageExamScoreTest() {
    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.getExamScores();
        String expected =  "Exam Scores:\nExam 1 -> 100\nExam 2 -> 95\nExam 3 -> 123\nExam 4 -> 96";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toStringTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String actual = student.toString();
        String expected = "Student Name: Leon Hunter\n Average Score: 125 \nExam Scores:\n Exam 1 -> 100\nExam 2 -> 150 \nExam 3 -> 250 \nExam 4 -> 0";
        Assert.assertEquals(expected, actual);
    }
}