package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.Double.*;

public class Homework_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //taskOne
        float number = checkFloat(scanner);

        //taskTwo
        taskTwo(number);

        //taskThree
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
        //taskFour
        checkLine(scanner);

    }

    // taskOne
    public static float checkFloat(Scanner scanner) {
        float number = 0;
        try {
            System.out.print("Введите дробное число: ");
            number = Float.parseFloat(scanner.nextLine());
            if (number == 0) {
                throw new NumberFormatException();
            }
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не дробное число!");
            System.out.println();
            checkFloat(scanner);
        }
        return number;
    }

    // taskTwo
    public static void taskTwo(float num) {
        int d  = 0;
        try {
            double result = num / d;
            if (Double.isNaN(result) || result == NEGATIVE_INFINITY || result == POSITIVE_INFINITY) {
                throw new ArithmeticException();
            }
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    // taskThree
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
    //taskFour
    public static void checkLine(Scanner scanner){
        try{
            System.out.print("Введите всё, что угодно, кроме пустой строки: ");
            String string = scanner.nextLine();
            if (string.length() == 0){
                throw new RuntimeException();
            }
            System.out.println("Отлично!");
        }catch (RuntimeException e){
            System.err.println("Вы ввели пустую строку!");
            System.out.println();
            checkLine(scanner);
        }

    }

}
