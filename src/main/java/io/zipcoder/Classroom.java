package io.zipcoder;

import java.util.*;

public class Classroom {


    private Student[] students;

    public Classroom(){
        students = new Student[30];
    }

    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for(Student student : students) sum += student.getAverageExamScore();
        return sum/students.length;
    }

    public void addStudent(Student student) {
        if (students[students.length-1] != null) {
            System.out.println("The classroom is full!");
            return;
        }
        int count = 0;
        for (Student s : students) {
            if (s == null) {
                students[count] = student;
                return;
            }
            count++;
        }

    }

    public void removeStudent(Student student) {
        int count = 0;
        for (Student s : students) {

            if (student.equals(s))  {
                students[count] = null;
            }
            count++;
        }
    }

    public Student[] getStudentsByScore() {
        Comparator<Student> comparator = (Comparator<Student>) new StudentComparator();
        Student[] sorted = students.clone();
        Arrays.sort(sorted, comparator);
        return sorted;
    }



    public HashMap getGradeBook() {
        HashMap map = new HashMap(students.length*2);
        for (Student s : students) {
            map.put(s, getGrade(s.getAverageExamScore()));
        }
        return map;
    }


    private String getGrade(Double studentAverage) {
        Student[] sortedStudents = getStudentsByScore();
        Integer total = students.length;
        int indexA = (int)Math.floor((10.0/100)*total+1);
        int indexB = (int)Math.floor((29.0/100)*total+1);
        int indexC = (int)Math.floor((30.0/100)*total+1);
        int indexD = (int)Math.floor((12.0/100)*total+1);
        if (studentAverage >= sortedStudents[indexA].getAverageExamScore()) return "A";
        else if(studentAverage >= sortedStudents[indexB].getAverageExamScore()) return "B";
        else if (studentAverage >= sortedStudents[indexC].getAverageExamScore()) return "C";
        else if (studentAverage >= sortedStudents[indexD].getAverageExamScore()) return "D";
        return "F";
    }


}
