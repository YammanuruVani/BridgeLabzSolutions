package com.bridgelabzpractcie;



//Java Program to demonstrate Inheritance

//Parent Class
class Vehicle {

 void start() {
     System.out.println("Vehicle is starting");
 }
}

//Child Class inheriting Parent Class
class Car extends Vehicle {

 void drive() {
     System.out.println("Car is driving");
 }
}

//Main Class
public class InheritanceProgram {

 public static void main(String[] args) {

     // Creating object of child class
     Car c = new Car();

     // Accessing parent class method
     c.start();

     // Accessing child class method
     c.drive();
 }
}