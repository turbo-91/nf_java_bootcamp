package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Student {
    String id;
    String name;
    String address;
    int grade;
}
