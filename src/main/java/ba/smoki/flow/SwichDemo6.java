package ba.smoki.flow;

import java.util.Scanner;

public class SwichDemo6 {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj mjeseca");
        int montNumber= new Scanner(System.in).nextInt();
        System.out.println("Unesi redni broj godine");
        int yearNumber= new Scanner(System.in).nextInt();
        int numberOfDaysInMonth=0;
        switch (montNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case  12:
                numberOfDaysInMonth=31;
                break;
            case  4 :
            case 6 :
            case  9:
            case 11:
                numberOfDaysInMonth=30;
                break;
            case  2:
                if((yearNumber%4==0 && yearNumber%100!=0)|| yearNumber%400==0){
             numberOfDaysInMonth=29;
            }else{
                numberOfDaysInMonth=28;
            }
            break;

         }
        System.out.println("Broj dana u mjesecu"+ montNumber+"i godini"+ yearNumber+ "jednak"+numberOfDaysInMonth);

}

}

