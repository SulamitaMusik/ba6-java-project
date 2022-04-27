 package AbstractClassPractice;

public class ATMMachineObjects {
    public static void main(String[] args) {
        ATMMachine atmMachine=new BankOfAmerica();
        String debit=" 1234 bofa 1234567891013456 123 09/09/2026";
        atmMachine.insertCard(debit);
        atmMachine=new PNC();
    }
}
