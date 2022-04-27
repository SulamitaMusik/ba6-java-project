package Encapsulation;

public class Animal {
   private String animal;
    private String color;
    private int numOfLegs;
    private  boolean hasTail;
    private  boolean isDomestic;


    public  Animal (String animal, String color,int numOfLegs, boolean hasTail,boolean isDomestic){
        this.animal=animal;
        this.color=color;
        this.numOfLegs=numOfLegs;
        this.hasTail=hasTail;
        this.isDomestic=isDomestic;

    }
    public void run(){
        System.out.println("Running "+animal);
    }
    public void eat(String food){
        System.out.println( animal + " eating "+food);
    }
    public void live(int years){
        System.out.println(animal+" live "+ years+" years.");
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public boolean isDomestic() {
        return isDomestic;
    }

    public void setDomestic(boolean domestic) {
        isDomestic = domestic;
    }
}
class Wolf extends Animal{
private int numOfTeeth;
    public Wolf(String animal, String color, int numOfLegs, boolean hasTail, boolean isDomestic, int numOfTeeth) {
        super(animal, color, numOfLegs, hasTail, isDomestic);
        this.numOfTeeth=numOfTeeth;

    }
    public void setNumOfTeeth(int numOfTeeth){
        this.numOfTeeth=numOfTeeth;
    }
    public int getNumOfTeeth(){
        return numOfTeeth;
    }
    @Override
    public void run() {
        System.out.println("Running " + getAnimal());
    }
}
class WolfBaby extends Wolf{

    public WolfBaby(String animal, String color, int numOfLegs, boolean hasTail, boolean isDomestic, int numOfTeeth) {
        super(animal, color, numOfLegs, hasTail, isDomestic, numOfTeeth);
    }
}
class Fish extends Animal{
private int swimSpeed;
    public Fish(String animal, String color, int numOfLegs, boolean hasTail, boolean isDomestic, int swimSpeed) {
        super(animal, color, numOfLegs, hasTail, isDomestic);
        this.swimSpeed=swimSpeed;
    }
    public void setSwimSpeed(int swimSpeed){
        this.swimSpeed=swimSpeed;
    }
    public int getSwimSpeed(int swimSpeed){
        return swimSpeed;
    }
@Override
    public void run(){
    System.out.println(getAnimal()+" swimming");
}
@Override
public void live(int years){
    System.out.println(getAnimal()+ " ives " + years);
}
}
class Dog extends Animal{

    public Dog(String animal, String color, int numOfLegs, boolean hasTail, boolean isDomestic) {
        super(animal, color, numOfLegs, hasTail, isDomestic);
    }
}
class Cat extends Animal{

    public Cat(String animal, String color, int numOfLegs, boolean hasTail, boolean isDomestic) {
        super(animal, color, numOfLegs, hasTail, isDomestic);
    }
}