package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void getAverageExamScore() {
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = new Student{s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double actual = classroom.getAverageExamScore();
        double expected = 125.0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudent() {
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0 };
        Student student = new Student("Leon", "Hunter", examScores);
    }

    @Test
    public void removeStudent() {
    }

    @Test
    public void getStudentsByScore() {
    }

    @Test
    public void getGradeBook() {
    }
}
