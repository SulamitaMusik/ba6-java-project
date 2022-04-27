package Encapsulation;

import java.util.Scanner;

public class ChocoBarObject {
    public static void main(String[] args) {
        ChocolateBar chocoBar=new ChocolateBar(2.5F,258547652,"5/6/2023",10.00, 25);

       //ChocolateBar bar= new ChocolateBar();
        System.out.println(chocoBar.toString());
         chocoBar.ingredientsAndFacts();

    }



}
