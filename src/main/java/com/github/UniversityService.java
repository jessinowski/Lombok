package com.github;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class UniversityService {
    // Bonus:
    // Create a class UniversityService and implement the following methods there:

    private Course course;
    private University university;

    // Write a function to calculate the average grade of a Course
    // (Pass the Course as a parameter).
    public double averageGradeOfCourse(Course course){
        Map<Integer, Student> map = course.getStudents();
        List<Student> students = new ArrayList<>(map.values());

        double average = students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .getAsDouble();

        return average;
    }

    // Write a function to calculate the average grade of the entire University
    // (Pass a University object as a parameter).
    public double averageGradeOfUniversity(University university){
        double averageCourseGrade = averageGradeOfCourse((Course) university.courses());
        double average;
        return average;
    }

    // Write a function that retrieves all students from a University
    // with a minimum grade of 2/"Good" and returns them as a list
    // (Pass a University object as a parameter).
}
