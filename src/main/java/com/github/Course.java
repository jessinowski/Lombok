package com.github;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Step 4:
// Create a class Course with the following attributes: id, name, teacher, students.
// Step 4.5:
// Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
@AllArgsConstructor
@Builder
@Data
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private Map<Integer, Student> students;
}
