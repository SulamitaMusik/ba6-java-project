package customer_managment;
import static  customer_managment.RandomGenerator.*;
import java.util.Locale;

public class Customer {
    private final String id;
    private String lastName;
    private String firstName;
    private String address;
    private Double balance;
    private final String ssn;

    public Customer( String lastName, String firstName, String address, String ssn) {
        this.id =generateRandomID();
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.balance =generaterandomeBalance();
        this.ssn=ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public String getId() {
        return id;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
    class RandomGenerator{
        public static String generateRandomID(){
            String str="absdefghijklmnopqrstuvwxyz0123456789";
            String result=" ";
            for (int i=0;i<8;i++){
               int random=(int) Math.random()*(str.length()+0);
               result=result+str.charAt(random);
            }
     return result.toUpperCase(Locale.ROOT);
    }
    public static double generaterandomeBalance(){
           return Math.random()*(1000-500)+500;
    }
}
