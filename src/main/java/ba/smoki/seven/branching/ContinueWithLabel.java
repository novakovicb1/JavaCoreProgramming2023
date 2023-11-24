package ba.smoki.seven.branching;

/**
 * da li se 'pan' javlja u recenici
 */

public class ContinueWithLabel {
    public static void main(String[] args) {
        String recenica="petar pan je pojeo";
        String rijec= "pan";
       boolean rijecJesteDioRecenice=false;
        int medja =recenica.length()-rijec.length();
         KOLEGA:  for ( int i=0; i<medja;i++){
             for (int j=0; j<recenica.length(); j++){
                 char slovoRecenice=recenica.charAt(i+j);
               char slovoRijeci=rijec.charAt(j);
               if (slovoRecenice!=slovoRijeci){
                   continue KOLEGA;
               }

           }
   rijecJesteDioRecenice=true;
    break;
}
String message=rijecJesteDioRecenice? "rijec jeste": "rijec nije";
System.out.println(message);
}
}