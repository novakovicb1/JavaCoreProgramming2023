package ba.smoki.six;

public class Homework2Demo {
    public static void main(String[] args) {
        int[] numbers={23,34,53,465,65757,76,7,5,34,43,23,23,23,23,123,345,123244};
        int sum=0;
        for (int number:numbers){
            sum=sum+number;
        }
        System.out.println("Suma="+sum);
    }
}
