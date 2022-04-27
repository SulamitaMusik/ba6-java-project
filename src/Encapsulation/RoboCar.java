package Encapsulation;

 public class RoboCar extends RoboVehicle {
        public RoboCar(int numberOfWheels, String make, String model,  String fuelType) {
            super(numberOfWheels, make, model,   fuelType);
        }
        @Override
        public void startEngine() {
            System.out.println(" RoboCar----> Engine started!");
        }
        @Override
        public void stop(){
            System.out.println("RoboCar is stopped");
        }
        @Override
        public String toString() {
            return "***RoboCar***" +
                    "\nnumberOfWheels= " + getNumberOfWheels() +
                    "\nmake= '" + getMake() + '\'' +
                    "\nmodel='" + getModel()+ '\'' +
                    "\nunitNumber=" + getUnitNumber() +
                    "\nmadeBY='" + getMadeBY() + '\'' +
                    "\nmadeIN='" + getMadeIN()+ '\'' +
                    "\nvinNumber='" + getVinNumber()+ '\'' +
                    "\nfuelType='" + getFuelType()  + '\'' ;
        }
}
