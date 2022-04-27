package Encapsulation;

import java.util.Scanner;

public class RoboVehicleObjects {

public static void main(String[] args) {
    RoboCar car=new RoboCar(5,"Mazda","Cx5","Water");
    RoboCar car2=new RoboCar(2,"Mazda","Cx5","Water");
    RoboCar car3=new RoboCar(3,"Mazda","Cx5","Water");
    RoboBike bike=new RoboBike(5,"MazdaBike","sx3","Electric");
    RoboBike bike2=new RoboBike(2,"MazdaBike","sx3","Electric");
    RoboBike bike3=new RoboBike(3,"MazdaBike","sx3","Electric");

    RoboVehicle[] vehicles={car,car2,car3,bike,bike2,bike3};
    for (int i=0; i< vehicles.length;i++){
        RoboVehicle vehicle=vehicles[i];
        vehicle.startEngine();
        vehicle.drive(28);
        vehicle.stop();
        if(vehicle instanceof RoboCar){
            ((RoboCar)vehicle).startEngine();
        }
        else if(vehicle instanceof RoboBike){
            ((RoboBike)vehicle).stop();
        }
        else if (vehicle instanceof RoboTruck){
            ((RoboTruck)vehicle).stop();
        }
        System.out.println(vehicle.printVehicleDetails());
    }








    }
}
