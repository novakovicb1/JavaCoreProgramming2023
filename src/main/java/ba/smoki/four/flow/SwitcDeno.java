package ba.smoki.four.flow;

import javax.swing.*;

/**
 * Zadatak:Imate tastaturu od 7.brojeva vas malac,moze stisnuti jedan od tih 7brojeva.
 * 1234567
 * Kada god pritisnu broj iskoci naziv u sedmici.
 * example:3"Mittwoch"
 * 4 -"Donnerstag"
 * 6- "Samstag"
 * 7-"Sontag"
 */

public class SwitcDeno {
    public static void main(String[] args) {
        String unos= JOptionPane.showInputDialog("Unesi redni broj dana u sedmici");
        int weekDayNumber=Integer.parseInt(unos);
        String weekDayName;

        switch (weekDayNumber){
            case 1:
                weekDayName="Lundi";
                break;
            case 2:
                weekDayName="Mardi";
                break;
            case 3:
                weekDayName="Mercedi";
                break;
            case 4:
                weekDayName="Jeudi";
                break;
            case 5:
                weekDayName="Vendredi";
                break;
            case 6:
                weekDayName="Samedi";
                break;
            case 7:
                weekDayName="Dimanche";
                break;
            default:
                weekDayName= "Non trouver";
        }
        JOptionPane.showMessageDialog(null,weekDayName);

    }
}
