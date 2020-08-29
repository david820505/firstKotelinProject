package com.tom;

public class Person {
    //field
    String name;
    float weight;
    float height;
    //建構子
    public Person(float weight, float height){
        //super();
        this.weight = weight;
        this.height = height;
    }
    //we can create multiple constructors:->overloading
    public Person(String name, float weight, float height){
        this(weight,height); //must put at first line
        this.name = name;
        //this.weight = weight;
        //this.height = height;
    }

    public float bmi(){
        float bmi = weight/(height*height);
        return bmi;
    }

    public void hello(){
        System.out.println("Hey Babe");
    }
}
