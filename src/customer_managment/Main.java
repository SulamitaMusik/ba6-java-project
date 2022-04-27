package customer_managment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Customer> customer= new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome to customer managment platform:");
        System.out.println("add | update | delete | info");
        String option=scan.nextLine();
        if(option.equalsIgnoreCase("add")){
            System.out.println("First name of customer: ");
            String firstName=scan.nextLine();
            System.out.println("Last name of customer: ");
            String lastName=scan.nextLine();
            System.out.println("Address of customer: ");
            String address=scan.nextLine();
            System.out.println("SSN of customer: ");
            String ssn=scan.nextLine();

            Customer newCustomer= new Customer(lastName,firstName,address, ssn);

        }








    }

}
