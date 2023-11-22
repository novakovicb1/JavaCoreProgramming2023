package ba.smoki.six.loop;

import java.util.Scanner;

public class BreakWithLabelDemo {
    public static void main(String[] args){
        int[][] dvodimenzijalniNiz={
                {32, 87,3, 589},
                {12,1076,2000, 8},
                {622,127,77,955},
        };
        //lenght=3-> int i =0,1,2
        System.out.println("Unesi broj i okusaj srecu");
        int uneseniBroj=new Scanner(System.in).nextInt();
        boolean nasao=false;
        UCIONICA:
        for (int i =0; i<dvodimenzijalniNiz.length;i ++){//{12,1076,2000,8}
            int []niz= dvodimenzijalniNiz[i];
            //4 prolaska kroz petlju
            for (int j =0;j<niz.length;j++){
                int  brojNiza= niz[j];
                if (brojNiza== uneseniBroj){
                    nasao=true;
                    break UCIONICA;
                }
            }

        }
        System.out.println(nasao?"SRECKO":  "NESRECKO");

}
    }
