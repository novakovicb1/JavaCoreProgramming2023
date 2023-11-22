package ba.smoki.six.loop;

import java.util.Scanner;

public class ContinueDemo {
    /** Zadatak
     * iybrojati koliko se u nekoj recenici javlja neko slovo.
     * recemo da je to slovo p
     * pretrazujemo u korisnickoj recenici
     *
     *
     */
    public static void main(String[] args) {
        //String -> niz karaktera
        System.out.println("Unesi recenicu");
        String recenica= new Scanner(System.in).nextLine();
        char slovo='p';
        // String - char
        char[]nizSlovaRecenice= recenica.toCharArray();
        int brojPonavljanja=0;
        for (int i =0; i < nizSlovaRecenice.length;i++){
            char slovoRecenice=nizSlovaRecenice[i];
            if (slovo!=slovoRecenice){
                continue;
            }
            brojPonavljanja++;
        }
        System.out.println("Broj ponavljanja slova 'p' u recenici: -"+ recenica+"- jednak"+brojPonavljanja);
    }
}
