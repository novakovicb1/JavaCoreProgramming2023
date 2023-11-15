package ba.smoki.four.question;

import java.util.Scanner;

/**
 * Napraviti program koji ce na izlazu prikzati da li je vrijednost promjenjive
 * koju je korisnik unio parna.
 * Takode treba da bude prikzana unesena crijednost.
 */
public class Question1 {
    public static void main(String[] args) {

        boolean provjera=true;

        System.out.println("Enter number:");
        int broj= new Scanner(System.in).nextInt();
        int ostatak= broj% 2;
        if (ostatak==0){
            System.out.println("Unesena vrijednost je parna");
        }
       if (ostatak==1){
           System.out.println("Unesena vrijednost je neparna");
       }


    }
}
