package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void StudentTest1(){
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
    public void getExamScoresTest() {
    }

    @Test
    public void getExamScoresArrayTest() {
    }

    @Test
    public void getAverageExamScoreTest() {
    }

    @Test
    public void addExamScoreTest() {
    }

    @Test
    public void getFirstNameTest() {
    }

    @Test
    public void setFirstNameTest() {
    }

    @Test
    public void getLastNameTest() {
    }

    @Test
    public void setLastNameTest() {
    }

    @Test
    public void setExamScoreTest() {
    }

    @Test
    public void printExamScoresTest() {
    }

    @Test
    public void toString1Test() {
    }
}