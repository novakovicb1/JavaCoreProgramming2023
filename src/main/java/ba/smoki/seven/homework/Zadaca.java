package ba.smoki.seven.homework;

import javax.swing.*;
import java.util.Random;

public class Zadaca {
    public static void main(String[] args) {
        Random generatorBroja= new Random();
        int[] numbers=new  int[11];
        for (int i =0;i<numbers.length;i++){
            numbers[i]=generatorBroja.nextInt(1001);
            System.out.println(numbers[i]);
        }
       int  redniBrojPokusaja = 0;
        int korisnickiBroj;
        LABELA:
        while (true) {
            String korisnickiUnos = JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
            korisnickiBroj = Integer.parseInt(korisnickiUnos);
            redniBrojPokusaja++;
            for (int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                if (number == korisnickiBroj) {
                    break LABELA;
                }
            }
        }
       String smajli="/uD83D/uDE00".repeat(15);
        String poruka = smajli+"/n"+"/uD83D/uDE00 Pogodio si iz"+ redniBrojPokusaja+"."+"pokusaja  /uD83D/uDE00"+"/n"+"uD83D/uDE00**"+korisnickiBroj+ "**je tvoj srecan broj!!!/uD83D/uDE00"+"/n"+ smajli;
     JOptionPane.showMessageDialog(null,poruka);

}
    }









