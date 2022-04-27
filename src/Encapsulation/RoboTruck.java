package Encapsulation;

public class RoboTruck extends RoboVehicle{
   private String trailer;
        public RoboTruck(int numberOfWheels, String make, String model, String fuelType,String trailer) {
            super(numberOfWheels, make, model, fuelType);
            this.trailer=trailer;
        }

        @Override
        public void startEngine() {
            System.out.println(" RoboTruck----> Engine started!");
        }

        @Override
        public void stop() {
            System.out.println("RoboTruck is stopped");
        }
        @Override
        public String toString() {
            return "***RoboTruck***" +
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


