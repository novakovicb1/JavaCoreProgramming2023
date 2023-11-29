package ba.smoki.eight;

public class Main {
    public static void main(String[] args) {

        int number=23;
        number=34;
        System.out.println(number);

        int[]numbers=new int[3];
        numbers[0]=23;
        numbers[1]=34;
        numbers[2]=21;
        System.out.println(numbers[0]+"a da je "+ numbers[1]);
        Movie movie1=new Movie();
        movie1.setDirector("Quentin Tarantino");
        movie1.setTitle("Good Felas");
        movie1.setDuration(146);
        movie1.setRating(90);
        System.out.println(movie1.getTitle()+"je ocjenjen ocjenom"+ movie1.getRating());
        Movie movie2= new Movie();
        movie2.setDirector("Pjer Zalica");
        movie2.setTitle("Strik");
        movie2.setDuration(120);
        movie2.setRating(-10);
        System.out.println(movie2.getTitle()+ "je ocjenjen ocjenom"+movie2.getRating());


    }
}
