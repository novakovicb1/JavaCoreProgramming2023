package ba.smoki.eight;

public class Movie {
    //POLJA ILI ATRIBUTI PROPERTITI OD KLASE
    private String director;
    private String title;
    private int duration;
    private int rating;//1-10

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating(){
        System.out.println("Neko hoce da zna ocjenu filma");
        return rating;


    }

    public void setRating( int rating){
        if (rating>10){
            rating=10;
        }
        if (rating<1){
            rating=1;
        }

         this.rating =rating;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
