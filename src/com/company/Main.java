package com.company;

public class Main {

    public static void main(String[] args) {                            //прога для 3 месяцев (март, апрель, май)
        int day = 31;
        int month = 3;
        int year = 2021;

        if (month == 3 && day < 31) {                                   //для марта
            ++day;
            System.out.println(day + "." + month + "." + year);
        } else if (month == 3 && day == 31) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year);
        } else if (month == 4 && day < 30) {                            //для апреля
            ++day;
            System.out.println(day + "." + month + "." + year);
        } else if (month == 4 && day == 30) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year);
        } else if (month == 5 && day < 31) {                            //для мая
            ++day;
            System.out.println(day + "." + month + "." + year);
        } else if (month == 5 && day == 31) {
            day = 1;
            ++month;
            System.out.println(day + "." + month + "." + year);
        } else {
            System.out.println("неверно введен день/месяц");
        }
    }
}
