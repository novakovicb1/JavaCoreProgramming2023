package ba.smoki.six.loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int[] numbers={32,87,3,589,13,23,107876,2000,8,6222,12};
        String korisnickiUnos= JOptionPane.showInputDialog("Unesi cijeli broj i okusaj srecu");
        int enteredNumber=Integer.parseInt(korisnickiUnos);
        boolean sretan= false;
        for (int i=0; i<numbers.length;i ++) {
            if (numbers[i] == enteredNumber) {
                sretan = true;
                break;
            }
        }
        String message= sretan ?"Srecko":"Nesrecko";
       /* if (sretan){
            message="Srecko";
        }else{
            message="Nesrecko";
        }*/
        System.out.println(message);
    }
}
