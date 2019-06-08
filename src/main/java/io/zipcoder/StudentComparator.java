package io.zipcoder;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    public int compare (Student first, Student second) {
        double difference = first.getAverageExamScore() - second.getAverageExamScore();
        if (difference < 0) return 1;
        if (difference > 0) return -1;
        int nameDifference = first.getFirstName().compareTo(second.getFirstName());
        if (nameDifference == 0) return first.getLastName().compareTo(second.getLastName());
        return nameDifference;
    }
}
