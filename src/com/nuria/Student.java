package com.nuria;

public class Student {
    private final Integer id;
    private final Double cgpa;
    private final String name;

    public Student(Integer id, Double cgpa, String name) {
        this.id = id;
        this.cgpa = cgpa;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", cgpa=" + cgpa +
                ", name='" + name + '\'' +
                '}';
    }
}
