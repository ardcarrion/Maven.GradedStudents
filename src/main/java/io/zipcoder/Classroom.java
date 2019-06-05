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

    public void addStudent(Student student){
        for (Student s : students) {
            if (s.equals(null)) {
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                break;
            }
        }

    }

    public void removeStudent(Student student) {

    }

    public Student[] getStudentsByScore() {
        TreeSet sorted = new TreeSet(Arrays.asList(students));
        ArrayList<Student> temp = new ArrayList<>(students.length);
        temp.addAll(sorted);
        Student[] result = new Student[students.length];
        return temp.toArray(result);
    }


    }


    public Map getGradeBook() {}


}
