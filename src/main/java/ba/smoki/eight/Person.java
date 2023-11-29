package ba.smoki.eight;

public class Person {
    private String name;
    private String surname;
    private int age;


    public Person(String ime,String prezime){
        this.name= ime;
        this.surname= prezime;
    }
    public Person(String ime, String prezime, int age ) {
        this.name = ime;
        this.surname = prezime;
        this.age = age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
