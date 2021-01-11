package com.majo.ocp.assignment1;

import java.util.Objects;

public class Student implements Comparable<Student> {

    String name;
    int number;
    int score;

    public Student(String name,
                   int number,
                   int score) {
        this.name = name;
        this.number = number;
        this.score = score;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public int getScore() {

        return score;
    }

    public void setScore(int score) {

        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return number == student.number &&
                score == student.score &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, score);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.name);
    }
}
