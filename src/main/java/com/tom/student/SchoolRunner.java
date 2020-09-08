package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //userInput();
        Student stu = new Student("Hank",77,90);
        stu.print();
        System.out.println("High Score: "+stu.highest());
    }

    private static void userInput() {
        System.out.println("Plz enter student name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Plz enter student english:");
        int english = scanner.nextInt();
        System.out.println("Plz enter student math:");
        int math = scanner.nextInt();
        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("High Score:"+stu.highest());
    }
}
