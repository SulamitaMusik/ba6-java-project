package Encapsulation;

import java.util.Scanner;

public class PhonesObject {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Phone Factory");
        System.out.println("What  kind of phone would you like us to build?");
        System.out.println("samsung | iphone");

        System.out.print("Your option: ");
        String option = scanner.nextLine().toLowerCase(); //samsung


        switch (option) {

            case "samsung": {
                System.out.println("Let's build your Samsung, help us customize it!!!");

                System.out.print("model: ");
                String model = scanner.nextLine();

                System.out.print("brand: ");
                String brand = scanner.nextLine();

                System.out.print("touchscreen? (true/false) ");
                boolean touchsreen = scanner.nextBoolean();

                System.out.print("5G? (true/false) ");
                boolean fiveG = scanner.nextBoolean();

                System.out.print("Capacity?: ");
                int capacity = scanner.nextInt();
                scanner.nextLine();

                System.out.print("OS: ");
                String os = scanner.nextLine();

                Samsung samsung = new Samsung(model, brand, touchsreen, fiveG, capacity, os);

                System.out.println("Your phone is ready: ");

                System.out.println(samsung);
            }
            break;

            case "iphone": {
                System.out.println("Let's build your Iphone, help us customize it!!!");

                System.out.print("model: ");
                String model = scanner.nextLine();

                System.out.print("brand: ");
                String brand = scanner.nextLine();

                System.out.print("touchscreen? (true/false) ");
                boolean touchsreen = scanner.nextBoolean();

                System.out.print("5G? (true/false) ");
                boolean fiveG = scanner.nextBoolean();

                System.out.print("Capacity?: ");
                int capacity = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Color: ");
                String color = scanner.nextLine();

                Iphone iphone = new Iphone(model, brand, touchsreen, fiveG, capacity, color, "China");

                System.out.println("Your IPhone is ready: ");

                System.out.println(iphone);
            }
            break;

            default:
                System.out.println("Invalid phone type");
        }
    }

}
