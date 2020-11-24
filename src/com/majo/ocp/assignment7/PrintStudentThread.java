package com.majo.ocp.assignment7;

public class PrintStudentThread extends Thread {

    private Student student;

    public PrintStudentThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println(student);
    }
}
