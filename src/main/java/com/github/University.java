package com.github;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

// Bonus:
// Create a record University with the following attributes: id, name, courses.

public record University(int id, String name, List<Course> courses) {
}
