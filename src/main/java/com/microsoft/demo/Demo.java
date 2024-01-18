package com.microsoft.demo;

public class Demo {

    public static main void(String[] args) {
        Demo test = new Demo();
        
        Demo.DoSomething(true);
    }
    
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
