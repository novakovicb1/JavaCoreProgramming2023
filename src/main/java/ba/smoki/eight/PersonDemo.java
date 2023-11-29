package ba.smoki.eight;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1= new Person("bojana"," bojanovic", 23);
        Person person2= new Person(" sara","radovic", 33);
        Person person3 = new Person("jelena", "novakovic");
        Person person4= new Person("mila","novakovic");
        System.out.println(person1.getName()+" "+ person1.getSurname()+" "+person1.getAge());
        System.out.println(person2.getName()+" "+person2.getSurname()+" "+person2.getAge());
        System.out.println(person3.getName()+" "+ person3.getSurname()+" "+person3.getAge());
        System.out.println(person4.getName()+" "+ person4.getSurname()+ person3.getAge());

    }
}
