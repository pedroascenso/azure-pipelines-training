package com.microsoft.demo;

public class Demo {

    public static void main (String[] args) {
        Demo test = new Demo();
        
        test.DoSomething(true);
    }
    
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
}
