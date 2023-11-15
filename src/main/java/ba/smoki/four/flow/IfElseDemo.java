package ba.smoki.four.flow;

import javax.swing.*;

public class IfElseDemo {
    public static void main(String[] args) {
        String profinUnos = JOptionPane.showInputDialog("Unesite broj poena koje je student ostavrio na ispitu");
        int brojPoena = Integer.parseInt(profinUnos);
        //A(10),B(9),C(8),D(7),E(6),F(5)
        char ocjena;
    if (brojPoena >= 90) {
           ocjena = 'A';
        } else if (brojPoena >= 80) {
            ocjena = 'B';
    } else if (brojPoena>=70) {
            ocjena = 'C';
        } else if (brojPoena>=60) {
            ocjena = 'D';
        } else if (brojPoena>=50) {
         ocjena='E';
        } else {
        ocjena='F';
        }
            String message="Ocjena="+ ocjena;
        JOptionPane.showMessageDialog(null,message);

    }
    }