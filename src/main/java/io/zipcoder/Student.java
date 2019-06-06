package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores(){
        StringBuilder result = new StringBuilder("Exam Scores:\n");
        int count = 1;
        for (Double score : examScores) {
            result.append(String.format("Exam %d -> %f\n", count, score));
        }
        return result.toString();
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (Double score : examScores) sum += score;
        return sum/(double)examScores.size();
    }

    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double[] getExamScoresArray() {
        Double[] scores = new Double[examScores.size()];
        return examScores.toArray(scores);
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.set(examNumber, newScore);
    }


    public void setExamScores(Double[] scores) {
        ArrayList<Double> grades = new ArrayList<Double>(Arrays.asList(scores));
        this.examScores = grades;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("Student Name: " + firstName + " " + lastName);
        result.append(String.format("Average Score: %f", getAverageExamScore()));
        result.append(getExamScores());
        return result.toString();
    }

}