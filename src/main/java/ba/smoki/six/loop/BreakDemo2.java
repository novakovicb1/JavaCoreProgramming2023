package ba.smoki.six.loop;

import javax.swing.*;

public class BreakDemo2 {
    public static void main(String[] args) {
            int [] numbers={32,87,35,589,13,23,107876,2000,8,6222,12};
            int n=0;
        boolean nasao= false;
        int uneseniBroj;
        while (true){
            String unos =JOptionPane.showInputDialog("Unesi broj i okusaj srecu");
             uneseniBroj=Integer.parseInt(unos);
            n++;
            for(int i=  0;i  < numbers.length; i++){
                if (uneseniBroj==numbers[i]){
                    nasao=true;
                    break;
                }
            }
            if (nasao){
                break;
            }
        }
        String message="Pogodio si iz"+n+"-tog pokusaja.Unesi broj"+ uneseniBroj+"je tvoj sretni";
        System.out.println(nasao? message: "Nesrecan");
    }
}
