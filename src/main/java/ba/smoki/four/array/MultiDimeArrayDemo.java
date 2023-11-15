package ba.smoki.four.array;

public class MultiDimeArrayDemo {
    public static void main(String[] args) {
     String[][] nameSurnameArray= {
             {"Mr.", "Mrs.", "Ms."},
             {"Smith","Jones"}
     };
     //Mr.Smith
     System.out.println(nameSurnameArray[0][0]+" "+ nameSurnameArray[1][0]);
     //Mrs.Jones
     System.out.println(nameSurnameArray[0][1]+" "+ nameSurnameArray[1][1]);
    }
}
