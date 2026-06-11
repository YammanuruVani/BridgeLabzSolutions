package com.bridgelabzpractcie;


//Parent Class
class Plane {

 void fly() {
     System.out.println("Plane is flying");
 }
}

//Child Class 1
class CargoPlane extends Plane {

 @Override
 void fly() {
     System.out.println("Cargo Plane flies at low height");
 }
}

//Child Class 2
class PassengerPlane extends Plane {

 @Override
 void fly() {
     System.out.println("Passenger Plane flies at medium height");
 }
}

//Child Class 3
class FighterPlane extends Plane {

 @Override
 void fly() {
     System.out.println("Fighter Plane flies at very high speed");
 }
}

//Main Class
public class PolymorphismProgram {

 public static void main(String[] args) {

     // Parent reference holding child objects
     Plane p;

     p = new CargoPlane();
     p.fly();

     p = new PassengerPlane();
     p.fly();

     p = new FighterPlane();
     p.fly();
 }
}