package com.tom;

public class Hello {
    public static void main(String [] args){
        //System.out.println("Hello");
        //new Person().hello();
        Person p = new Person(66.7f,1.75f);
        p.hello();
        p.height = 1.86f;
        p.weight = 66.7f;
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score >60 && score <90);
        char c = 'A';
        System.out.println(c>'a');
        /*int age = 19;
        Integer age2 = 19;
        //ctrl + d quick copy
        //ctrl + y quick delete
        Integer age4 = 19;*/
    }
}
