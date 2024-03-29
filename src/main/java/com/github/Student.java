package com.github;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

// Step 2:
// Create a simple class "Student" with the following attributes: id, name, address, grade.
// Step 2.5:
// Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
@Data
@AllArgsConstructor
@Builder
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private int grade;
}
