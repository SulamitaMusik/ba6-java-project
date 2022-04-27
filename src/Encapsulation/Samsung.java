package Encapsulation;

public class Samsung  extends  Phone{
    private String os;

    public Samsung(String model, String brand, boolean isTouchScreen, boolean is5G, int capacity, String os) {
        super(model, brand, isTouchScreen, is5G, capacity);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public void sendMessage(String number, String message){
        System.out.println("Samsung sending: " + message + " to: " + number);
    }

    public void call(String number){
        System.out.println("Samsung Calling: " + number);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", isTouchScreen=" + isTouchScreen() +
                ", is5G=" + isIs5G() +
                ", capacity=" + getCapacity() +
                ", os='" + getOs() + '\'' +
                '}';
    }
}

