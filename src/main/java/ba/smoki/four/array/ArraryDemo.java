package ba.smoki.four.array;

public class ArraryDemo {
    public static void main(String[] args) {
        int broj =23;
        System.out.println(broj);
        broj= 1;
        System.out.println(broj);
        broj=10;
        System.out.println(broj);


        //Prvi slozeni tip zadatka je niz
        // koliko polja mi treba ili koliko brojeva cu skladistiti u nizu
        int[] brojevi=new int[3];
        brojevi[0]= 23;
        brojevi[1]=1;
        brojevi[2]=10;
        System.out.println("Element na indeksu 0="+ brojevi[0]);
        System.out.println("Element na indesu 1="+ brojevi[1]);
        System.out.println("Element na indeksu2= "+brojevi[2]);

        // Drugi nacin kreiranja niza je kad znamo brojeve koje cemo unjeti

    }
}
