package ba.smoki.five.loop;

import java.util.Scanner;

public class    WhileDemo {
    public static void main(String[] args) {
        //  while (true){
        //      System.out.println("Dan je bio lijep dok nisam dosao na cas programiranja");
        //        System.out.println("Guzva nijje bila toliko frustrirajuca");
        //      System.out.println("Nmea parkinga ali ni to nije bilo frustrirajuce");
        //
        int i  =new Scanner(System.in).nextInt();
        while (i <= 10) {
            System.out.println("Broj:" + i);
            i++;
        }
    }
}
