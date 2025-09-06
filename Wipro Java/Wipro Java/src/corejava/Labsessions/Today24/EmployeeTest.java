package corejava.Labsessions.Today24;

abstract class Employee1 {
 String name;  // Employee name
 int id;       // Employee ID

 // Constructor to initialize common fields
 public Employee1(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method to be implemented by subclasses
 abstract double calculateSalary();

 // Method to display basic details
 public void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

//Subclass for permanent employees
class PermanentEmployee extends Employee1 {
 double monthlySalary;

 // Constructor for PermanentEmployee
 public PermanentEmployee(String name, int id, double monthlySalary) {
     super(name, id); // Calling constructor of Employee1
     this.monthlySalary = monthlySalary;
 }

 // Implementing the abstract method
 @Override
 double calculateSalary() {
     return monthlySalary;
 }
}

//Subclass for contract employees
class ContractEmployee extends Employee1 {
 double hourlyRate;
 int hoursWorked;

 // Constructor for ContractEmployee
 public ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
     super(name, id); // Calling constructor of Employee1
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 // Implementing the abstract method
 @Override
 double calculateSalary() {
     return hourlyRate * hoursWorked;
 }
}

//Main class to test the hierarchy
public class EmployeeTest {
 public static void main(String[] args) {
     // Creating a permanent employee
     PermanentEmployee emp1 = new PermanentEmployee("Sarena", 1001, 50000);
     emp1.displayDetails();
     System.out.println("Salary: ₹" + emp1.calculateSalary());

     System.out.println();

     // Creating a contract employee
     ContractEmployee emp2 = new ContractEmployee("Nate", 2002, 800, 20);
     emp2.displayDetails();
     System.out.println("Salary: ₹" + emp2.calculateSalary());

	}

}
