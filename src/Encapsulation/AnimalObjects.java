package Encapsulation;

public class AnimalObjects {
    public static void main(String[] args) {

        Wolf wolfik=new Wolf("Wolf","White",4,true,true,50);
       Fish fish=new Fish("Cloun","orange",0,true, true,50);
       Dog dog=new Dog("Dog","brown",4,true, true);
        WolfBaby wolfikBaby= new WolfBaby("wolfik","grey",4,true,true,50);
      Animal[] animal ={wolfik,fish,dog,wolfikBaby, new Cat("cat","yellow",4,true,true)};

for (int i=0;i<animal.length;i++) {
    Animal animal2 = animal[i];
    animal2.run();
    System.out.println( animal2.getColor());
    if (animal2 instanceof Wolf) {
        animal2.eat("Myasoo for wolf");


    } else if (animal2 instanceof Fish) {
        animal2.eat("Myasoo for fish");

    } else if (animal2 instanceof Dog) {
        animal2.eat("Myasoo for Dog");

    } else if (animal2 instanceof WolfBaby) {
        animal2.eat("Myasoo for WolfBaby");
    }


}}}