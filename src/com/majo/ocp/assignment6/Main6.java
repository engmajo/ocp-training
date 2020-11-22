package com.majo.ocp.assignment6;

import java.util.*;
import java.util.stream.Collectors;

public class Main6 {

    public static void main(String[] args) {

        //1
        System.out.println(getStudentList().stream().map(Student::getName).collect(Collectors.joining("- ", ">>", "<<")));

        //2
        System.out.println(getStudentList().stream().map(Student::getName).collect(Collectors.averagingDouble(String::length)));

        List<String> names = Arrays.asList("AbD", "Ahmad", "Ali", "KHALED");
        //3

        //4
        Map<Integer, List<String>> map4 = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map4);

        //5
        HashMap<Character, List<String>> map5 = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0), HashMap::new, Collectors.toList()));
        System.out.println(map5);

        //6
        Map<Boolean, List<String>> map6 = names.stream().collect(Collectors.partitioningBy(e -> e.toUpperCase().startsWith("A"), Collectors.toList()));
        System.out.println(map6);

        //7
        TreeMap<Integer, Set<String>> map7 = names.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map7);
    }

    private static List<Student> getStudentList() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Mohammad", 1, 100));
        students.add(new Student("Ali", 2, 95));
        students.add(new Student("Yousef", 3, 90));
        students.add(new Student("Khaled", 4, 85));
        students.add(new Student("Ahmad", 5, 80));
        students.add(new Student("Abdullah", 6, 75));
        students.add(new Student("Wasfi", 7, 70));
        students.add(new Student("S1", 8, 65));
        students.add(new Student("S2", 9, 60));
        students.add(new Student("S3", 10, 55));
        return students;

    }
}
