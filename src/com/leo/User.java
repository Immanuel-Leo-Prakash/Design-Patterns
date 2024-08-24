package com.leo;

public class User {
    //Fields(attributes)
    public String name;

    public User(String name){
       this.name=name;
    }
    //Methods
    public void sayHello(){
        System.out.println("Hi, my name is "+ this.name);
    }
}
