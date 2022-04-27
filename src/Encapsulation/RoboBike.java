package Encapsulation;

public class RoboBike extends RoboVehicle {

        public RoboBike(int numberOfWheels, String make, String model, String fuelType) {
            super(numberOfWheels, make, model, fuelType);
        }

        @Override
        public void startEngine() {
            System.out.println(" RoboBike---> Engine started!");
        }

        @Override
        public void stop() {
            System.out.println("RoboBike is stopped");
        }

        @Override
        public String toString() {
            return "***RoboBike***" +
                    "\nnumberOfWheels= " + getNumberOfWheels() +
                    "\nmake= '" + getMake() + '\'' +
                    "\nmodel='" + getModel() + '\'' +
                    "\nunitNumber=" + getUnitNumber() +
                    "\nmadeBY='" + getMadeBY() + '\'' +
                    "\nmadeIN='" + getMadeIN() + '\'' +
                    "\nvinNumber='" + getVinNumber() + '\'' +
                    "\nfuelType='" + getFuelType() + '\'';
        }
    }

