package org.example;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String postalCode;
    private int age;

    // Constructor
    public Student(int id, String name, String postalCode, int age) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    // Getters and toString for debugging
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', postalCode='" + postalCode + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name) && Objects.equals(postalCode, student.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postalCode, age);
    }
}
