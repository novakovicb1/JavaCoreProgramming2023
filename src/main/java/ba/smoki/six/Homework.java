package ba.smoki.six;

public class Homework {
    public static void main(String[] args) {
        int[] numbers={23,34,53,465,65757,76,7,767,5,34,43,23,23,23,23,123,345,123244};
        int sum=0;
        for (int i =0; i < numbers.length; i ++){
         int number=numbers[i];
         sum=sum+ number;//sum=0+23?->sum=23+34->sum=57+52->sum=109+465

        }
        System.out.println("Suma= "+sum);
    }
    }