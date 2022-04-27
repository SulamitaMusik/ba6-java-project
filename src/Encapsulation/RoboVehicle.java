package Encapsulation;

import java.util.Random;

public class RoboVehicle {
 Random random=new Random();

 private int   numberOfWheels;
 private       String make;
 private       String  model;
 private int          unitNumber;
 private final String madeBY="TechCenture Auto Industries Inc";
 private final String madeIN="124 Robo Drive, Mclean, VA, 22102, United States";
 private       String vinNumber;
 private       String fuelType;

 public RoboVehicle(int numberOfWheels, String make, String model,  String fuelType) {
  this.numberOfWheels = numberOfWheels;
  this.make = make;
  this.model = model;
  this.unitNumber=randomUnitNum();
  this.vinNumber = createVIN();
  this.fuelType = fuelType;
 }

 public int getNumberOfWheels() {
  return numberOfWheels;
 }

 public void setNumberOfWheels(int numberOfWheels) {
  this.numberOfWheels = numberOfWheels;
 }

 public String getMake() {
  return make;
 }

 public void setMake(String make) {
  this.make = make;
 }

 public String getModel() {
  return model;
 }

 public void setModel(String model) {
  this.model = model;
 }

 public int getUnitNumber() {
  return unitNumber;
 }

 public String getMadeBY() {
  return madeBY;
 }

 public String getMadeIN() {
  return madeIN;
 }

 public String getVinNumber() {
  return vinNumber;
 }


 public String getFuelType() {
  return fuelType;
 }

 public void setFuelType(String fuelType) {
  this.fuelType = fuelType;
 }

public   String createVIN(){
 String str="abcdefjhijklmnopqrstuvwxyz0123456789";
 String result="";
 for(int i =0; i< str.length();i++){
  int random = (int)(Math.random()*(str.length()-0)+0);
   result=result+str.charAt(random);
 }
 return result;
}
 public int randomUnitNum(){
 int randomUnitNum=random.nextInt(9999999) + 1000000;
 return randomUnitNum;
 }

 public void startEngine() {
  System.out.println( getClass().getName()+"Engine started!");
 }

public void drive(int speed){
if(speed>0&&speed<500){

 System.out.println("Your speed is "+speed);
}else{
 System.out.println("Speed cannot be "+speed);
}
}
public void accelerate(int speed){
if(speed>0&& speed<500){
 System.out.println("Your speed is "+ speed +"! You can accelerate your speed!");
}else if(speed<=0){
 System.out.println("Speed cannot be negative!");
}else{
 System.out.println("Speed is to high");
}
}
public void stop(){
 System.out.println(getClass().getName()+"Vehicle is stopped");
}
private  void fly(int height){
  if(height>0){
   System.out.println("You can fly! Your height is: " + height);
  }else{
   System.out.println("Height should be more than "+height+ " to fly!");
  }

}
public  String printVehicleDetails(){
  return "RoboVehicle Details:\n" +
          "NUMBER OF WHEELS: " +numberOfWheels +
          "       \nMAKE:  "                 +make+
          "       \nMODEL:  "            + model +
          "       \nUNIT NUMBER: "           +unitNumber +
          "       \nVIN: "                  + vinNumber+
          "       \nFUEL TYPE: "           + fuelType;
}

 @Override
 public String toString() {
  return "***RoboVehicle***" +
          "\nNUMBER OF WEELS= " + getNumberOfWheels() +
          "\nMAKE= '" + getMake() + '\'' +
          "\nMODEL='" + getModel()+ '\'' +
          "\nUNIT NUMBER=" + getUnitNumber() +
          "\nMADE BY='" + getMadeBY() + '\'' +
          "\nMADE IN='" + getMadeIN()+ '\'' +
          "\nVIN NUMBER='" + getVinNumber()+ '\'' +
          "\nFUEL TYPE='" + getFuelType()  + '\'' ;
 }

}









