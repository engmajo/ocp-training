package com.majo.ocp.assignment5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main5 {

    public static void main(String[] args) {

        List<Student> studentList = getStudentList(16);
        System.out.println(studentList);

        studentList.stream().filter(e -> e.getScore() > 50).forEach(System.out::println);
        studentList.stream().map(e -> e.getName().length()).forEach(System.out::println);

        List<Student> community1 = studentList.subList(0, 5);
        List<Student> community2 = studentList.subList(6, 10);
        List<Student> community3 = studentList.subList(7, 16);

        Stream<List<Student>> communitiesStream = Stream.of(community1, community2, community3);
        communitiesStream.flatMap(Collection::stream).filter(e -> e.getScore() > 35).distinct().limit(5).forEach(System.out::println);
    }

    private static List<Student> getStudentList(int numberOfStudents) {

        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= numberOfStudents; i++) {
            students.add(new Student("S" + i, i, (int) (Math.random() * 100)));
        }
        return students;
    }
}
