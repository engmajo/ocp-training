package com.majo.ocp.assignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("A", 1, 10));
        students.add(new Student("B", 2, 20));
        students.add(new Student("C", 3, 30));
        students.add(new Student("D", 4, 40));
        students.add(new Student("E", 4, 50));
        students.add(new Student("F", 5, 60));
        students.add(new Student("G", 7, 70));
        students.add(new Student("H", 8, 80));

        // 1.Find the student with maximum score.
        System.out.println("1.Find the student with maximum score.");
        System.out.println(students.stream().max(Comparator.comparingInt(e -> e.score)).get().score);

        // 2.Find the student with minimum score.
        System.out.println("2.Find the student with minimum score.");
        System.out.println(students.stream().min(Comparator.comparingInt(e -> e.score)).get().score);

        // 3.Print any student and first student information.
        System.out.println("3.Print any student and first student information.");
        System.out.println(students.stream().findAny().get());
        System.out.println(students.stream().findFirst().get());

        // 4.Print if all students have score >50.
        // (I understood that all scores should be greater than 50)
        System.out.println("4.Print if all students have score >50.");
        System.out.println(students.stream().allMatch(e -> e.score > 50));

        // 5.Print if any student has score =70.
        System.out.println("5.Print if any student has score =70.");
        System.out.println(students.stream().anyMatch(e -> e.score == 50));

        // 6.Print if you don’t have any student with score =89.
        System.out.println("6.Print if you don’t have any student with score =89.");
        System.out.println(students.stream().noneMatch(e -> e.score == 89));

        // 7.Print all student using (forEach), you can use toString method.
        System.out.println("7.Print all student using (forEach), you can use toString method.");
        students.forEach(System.out::println);
        students.stream().forEach(System.out::println);
        students.parallelStream().forEach(System.out::println);

        // 8.Concatenate all student’s names in one string (use reduce method)
        System.out.println("8.Concatenate all student’s names in one string (use reduce method)");
        String studentsNames = students.stream().map(student -> student.name).reduce("", String::concat);
        System.out.println(studentsNames);

        // 9.Save students in treeSet (use collect method but Without using method reference).
        System.out.println("9.Save students in treeSet (use collect method but Without using method reference).");
        TreeSet<Student> collect = students.stream().collect(() -> new TreeSet<>(),
                (TreeSet<Student> treeSet, Student value) -> treeSet.add(value),
                (TreeSet<Student> t1, TreeSet<Student> t2) -> t1.addAll(t2));
        System.out.println(collect);
        TreeSet<Student> collect1 = students.stream().collect(TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(collect1);
        // Simply we can do it like this
        System.out.println(new TreeSet<>(students));


    }
}
