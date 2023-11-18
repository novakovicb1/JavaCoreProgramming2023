package ba.smoki.five.loop;

import java.util.Scanner;

public class DoWileDemo {
    public static void main(String[] args) {
        int i =new Scanner(System.in).nextInt();
        do{
            System.out.println("Broj="+i);
            i++;
        }while (i<=10);
    }
}
