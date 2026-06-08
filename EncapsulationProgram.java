package com.bridgelabzpractcie;


//POJO Class demonstrating Encapsulation

class Employee {

 // Private fields (Data Hiding)
 private String employeeName;
 private int employeeId;
 private double employeeSalary;

 // Default Constructor
 public Employee() {
 }

 // Parameterized Constructor
 public Employee(String employeeName, int employeeId, double employeeSalary) {
     this.employeeName = employeeName;
     this.employeeId = employeeId;
     this.employeeSalary = employeeSalary;
 }

 // Getter Methods
 public String getEmployeeName() {
     return employeeName;
 }

 public int getEmployeeId() {
     return employeeId;
 }

 public double getEmployeeSalary() {
     return employeeSalary;
 }

 // Setter Methods
 public void setEmployeeName(String employeeName) {
     this.employeeName = employeeName;
 }

 public void setEmployeeId(int employeeId) {
     this.employeeId = employeeId;
 }

 public void setEmployeeSalary(double employeeSalary) {
     this.employeeSalary = employeeSalary;
 }
}
 public class EncapsulationProgram {
//Main Class
 public static void main(String[] args) {

     // Creating object using default constructor
     Employee emp = new Employee();

     // Setting values using setter methods
     emp.setEmployeeName("Vani");
     emp.setEmployeeId(101);
     emp.setEmployeeSalary(50000);

     // Getting values using getter methods
     System.out.println("Employee Name : " + emp.getEmployeeName());
     System.out.println("Employee ID : " + emp.getEmployeeId());
     System.out.println("Employee Salary : " + emp.getEmployeeSalary());
 }
 }
