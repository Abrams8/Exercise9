package com.company;

public class Main {

    public static void main(String[] args) {                            //прога для 3 месяцев (март, апрель, май)
        int day = 31;
        int month = 3;
        int year = 2021;
        
        if(day<0 || month<0 || month > 12 || year < 0) {
            throw new IllegalArgumentException("неверно введен день/месяц");
        }

        if (month == 3 && day < 31) {                                   //для марта
            ++day;
            
        } else if (month == 3 && day == 31) {
            day = 1;
            ++month;
            
        } else if (month == 4 && day < 30) {                            //для апреля
            ++day;
            
        } else if (month == 4 && day == 30) {
            day = 1;
            ++month;
            
        } else if (month == 5 && day < 31) {                            //для мая
            ++day;
            
        } else if (month == 5 && day == 31) {
            day = 1;
            
            year++;
            month = 1
           
        } 
        System.out.println(day + "." + month + "." + year);
      
    }
}
