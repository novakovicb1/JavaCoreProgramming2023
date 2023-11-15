package ba.smoki.four.flow;

import javax.swing.*;

public class SwichDemo2 {
    public static void main(String[] args) {
        String weekDayName = JOptionPane.showInputDialog("Unesi ime dana u sedmici na francuskom");
        String weekDayNativeName;
        switch (weekDayName) {
            case "Lundi":
                weekDayNativeName = "Ponedjeljak";
                break;
            case "Mardi":
                weekDayNativeName = "Utorak";
                break;
            case "Mercreudi":
                weekDayNativeName = "Srijeda";
                break;
            case "Jeudi":
                weekDayNativeName = "Cetvrtak";
                break;
            case "Vandredi":
                weekDayNativeName = "Petak";
                break;
            case "Samedi":
                weekDayNativeName = "Subota";
                break;
            case "Dimanche":
                weekDayNativeName = "Nedjelja";
                break;

            default:
                weekDayNativeName = "Ponovite unos";
        }
        JOptionPane.showMessageDialog(null,weekDayNativeName);

        }
    }
