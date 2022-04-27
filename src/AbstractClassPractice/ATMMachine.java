package AbstractClassPractice;

public interface ATMMachine {
    void insertCard(String card);
    void depositCash(double amount);
    void depositCheck(String check);
    void withdrawChash(double amount);
    void checkBalance();


}
class BankOfAmerica implements ATMMachine {

    @Override
    public void insertCard(String card) {
        boolean result = verifyCard(card);
        if (result) {
            System.out.println("Logged in ");
        } else {
            System.out.println("Unknown card");
        }
    }

    @Override
    public void depositCash(double amount) {

    }

    @Override
    public void depositCheck(String check) {

    }

    @Override
    public void withdrawChash(double amount) {

    }

    @Override
    public void checkBalance() {

    }

    private boolean verifyCard(String card) {
        String[] split = card.split(" ");
        String pin = split[0];
        String bankKeyword = split[1];
        String sixteenDN = split[2];
        String cvc = split[3];
        String exp = split[4];
        if (bankKeyword.equalsIgnoreCase("bofa")) {
            if (sixteenDN.length() == 16) {
                if (cvc.length() == 3) {
                    if (exp.contains("/")) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

}
class PNC implements ATMMachine {

    @Override
    public void insertCard(String card) {
        boolean result = verifyCard(card);
        if (result) {
            System.out.println("Logged in ");
        } else {
            System.out.println("Unknown card");
        }
    }

    @Override
    public void depositCash(double amount) {

    }

    @Override
    public void depositCheck(String check) {

    }

    @Override
    public void withdrawChash(double amount) {

    }

    @Override
    public void checkBalance() {

    }

    private boolean verifyCard(String card) {
        String[] split = card.split(" ");
        String pin = split[0];
        String bankKeyword = split[1];
        String sixteenDN = split[2];
        String cvc = split[3];
        String exp = split[4];
        if (bankKeyword.equalsIgnoreCase("bofa")) {
            if (sixteenDN.length() == 16) {
                if (cvc.length() == 3) {
                    if (exp.contains("/")) {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
