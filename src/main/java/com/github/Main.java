package com.github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Step 5:
        // Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
        Student jessica = new Student(123, "Jessica", "Hamburg", 1);
        Student dennis = new Student(156, "Dennis", "Bremen", 3);
        Student kim = new Student(145, "Kim", "Hamburg", 1);
        Student georg = new Student(125, "Georg", "Braunschweig", 2);

        Map<Integer, Student> students =  new HashMap<>();
        students.put(123,jessica);
        students.put(156,dennis);
        students.put(145,kim);
        students.put(125,georg);

        Teacher mueller = new Teacher(225,"Müller", "Mathe");
        Teacher zwanzig = new Teacher(226,"Zwanzig", "Physik");
        Teacher koch = new Teacher(221,"Koch", "Deutsch");

        Course math = new Course(31, "Mathe", mueller, students);

        System.out.println(math);
        System.out.println();
        System.out.println(jessica.getGrade());

        // Add the Builder pattern to all entities and create additional objects with the Builder in the main method.
        Course physics = new Course.CourseBuilder().name("Physik").teacher(zwanzig).build();
        System.out.println();
        System.out.println(physics);

        // Use the With annotation to facilitate changing properties.
        Student jessica2 = jessica.withId(124);
        System.out.println();
        System.out.println(jessica2);

        // Bonus
        UniversityService universityService = new UniversityService();
        System.out.println();
        System.out.println(universityService.averageGradeOfCourse(math));
    }
}