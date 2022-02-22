/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6;

/**
 *
 * @author rominalodolo
 */
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.firstName = "Amanda";
        emp1.lastName = "Ally";
        emp1.empId = 001;
        emp1.age = 43;
        emp1.homeAddress = "50 Signal Rd, Riverside, Pretoria.";
         
        System.out.println("Name: " + emp1.firstName);
        System.out.println("Surname: " + emp1.lastName);
        System.out.println("Age: " + emp1.age);
        System.out.println("Employee ID: " + emp1.empId);
        System.out.println("Home Address: " + emp1.homeAddress);
    }
}
