package org.example;

import java.util.Scanner;

public class Human {
    private String surname;
    private String firstName;
    private String lastName;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void humanData(){
        System.out.println("Введите следующие данные через пробел: Фамилия Имя Отчество дата рождения номер телефона пол");
        Scanner in = new Scanner(System.in);
        String str = (in.nextLine());
        String [] data = str.split(" ");

        if (data.length == 6){

            surname = data[0];
            firstName = data[1];
            lastName = data[2];
            String bd = data[3];
            String [] bday = bd.split("");
            if (bday[2].equals(".") && bday[5].equals("."))  {
                birthday = data[3];}
            else {
                System.out.println("Вы ввели некорректное значение даты рождения");

            }
            try {int pn = Integer.parseInt(data[4]);
                phoneNumber = data[4];
            } catch (NumberFormatException e){
                System.out.println("Вы ввели некорректное значение номера телефона");

            }
            if (data[5].equals("m") || data[5].equals("f")){
                gender = data[5];}
            else {
                System.out.println("Вы ввели некорректное значение пола");

            }
        }else{

            throw new IndexOutOfBoundsException("Вы ввели некорректное количество запрашиваемых данных");}

    }
}
