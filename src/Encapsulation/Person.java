package Encapsulation;



public class Person {
    public String name;
    public int age;
    public void speak (String language){
        System.out.println("Person speaks"+ language);
    }

}
class Doctor extends Person{
    public void treat(String pill){
        System.out.println("Doctor recomends "+ pill);
    }
}
class Couch extends Person {
    public void train(int numOfPeople) {
        System.out.println("Couch train " + numOfPeople + " people.");
    }

    public static void main(String[] args) {
        Person sulya = new Couch();
        ((Couch)sulya).train(500);

        }
        int random=(int)(Math.random()*15);
    }

