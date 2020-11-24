package com.majo.ocp.assignment7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main7 {

    public static void main(String[] args) {

        //1
        Student student = new Student("Mohammad", 1, 1);
        PrintStudentJob employeeNamesJob = new PrintStudentJob(student);
        Thread printStudentThread = new PrintStudentThread(student);

        //2
        new Thread(() -> {
            System.out.println(student);
        }).start();

        //3
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> submit = service.submit(() -> 10);
            new Thread("Print Thread") {

                public void run() {
                    System.out.println("Print Thread Start...");
                    try {
                        System.out.println(submit.get());
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Print Thread End...");
                }

            }.start();
        } finally {
            if (service != null) {
                service.shutdown();
                System.out.println("Shutdown service...");

            }
        }
    }
}
