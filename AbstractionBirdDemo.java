package com.bridgelabzpractcie;

//Abstract class
abstract class Bird {

 // Abstract methods
 abstract void fly();

 abstract void sound();

 // Normal method
 void eat() {
     System.out.println("Bird is eating");
 }
}

//Child class 1
class Sparrow extends Bird {

 void fly() {
     System.out.println("Sparrow flies at low height");
 }

 void sound() {
     System.out.println("Sparrow chirps");
 }
}

//Child class 2
class Eagle extends Bird {

 void fly() {
     System.out.println("Eagle flies very high");
 }

 void sound() {
     System.out.println("Eagle screams");
 }
}

//Main class
public class AbstractionBirdDemo {

 public static void main(String[] args) {

     Sparrow sp = new Sparrow();
     sp.fly();
     sp.sound();
     sp.eat();

     System.out.println();

     Eagle eg = new Eagle();
     eg.fly();
     eg.sound();
     eg.eat();
 }
}