package com.majo.ocp.assignment7;

public class PrintStudentJob implements Runnable {

    private Student student;

    public PrintStudentJob(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println(student);
    }
}
