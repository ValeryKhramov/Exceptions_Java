package org.example;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        try {
             number = 10/0;
        }catch (ArithmeticException e){
            System.out.println("operation divide by zero not supported ");
        }
        System.out.println(number);
    }
}