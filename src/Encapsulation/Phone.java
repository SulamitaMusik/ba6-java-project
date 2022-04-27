package Encapsulation;

public class Phone {

    //POJO

        private String model;
        private String brand;
        private boolean isTouchScreen;
        private boolean is5G;
        private int capacity;

        public Phone(String model, String brand, boolean isTouchScreen, boolean is5G, int capacity) {
            this.model = model;
            this.brand = brand;
            this.isTouchScreen = isTouchScreen;
            this.is5G = is5G;
            this.capacity = capacity;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {

            this.model = model;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public boolean isTouchScreen() {
            return isTouchScreen;
        }

        public void setTouchScreen(boolean touchScreen) {
            isTouchScreen = touchScreen;
        }

        public boolean isIs5G() {
            return is5G;
        }

        public void setIs5G(boolean is5G) {
            this.is5G = is5G;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public void sendMessage(String number, String message){
            System.out.println("sending: " + message + " to: " + number);
        }

        public void call(String number){
            System.out.println("Calling " + number);
        }

    }

