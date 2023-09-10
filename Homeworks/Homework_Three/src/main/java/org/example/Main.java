package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Human Andrey = new Human();
        Andrey.humanData();
        try{ SaveFile saveToFile = new SaveFile();
            saveToFile.save(Andrey);}
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}