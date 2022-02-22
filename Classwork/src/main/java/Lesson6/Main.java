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
        Employee emp1 = new Employee("Amanda","Ally",001,43,"50 Signal Rd, Riverside, Pretoria.");
        Employee emp2 = new Employee("Anne", "Gurdle",002,39,"2 Shepstone Gardens, SunnyHill, Pretoria.");
//        emp1.firstName = "Amanda";
//        emp1.lastName = "Ally";
//        emp1.empId = 001;
//        emp1.age = 43;
//        emp1.homeAddress = "50 Signal Rd, Riverside, Pretoria.";
//         
      
//        emp1.setAge(43);
//        emp1.setEmpId(001);
//        emp1.setFirstName("Amanda");
//        emp1.setLastName("Ally");
//        emp1.setHomeAddress("50 Signal Rd, Riverside, Pretoria."); 
//        
//        emp2.setAge(39);
//        emp2.setEmpId(002);
//        emp2.setFirstName("Anne");
//        emp2.setLastName("Gurdle");
//        emp2.setHomeAddress("2 Shepstone Gardens, SunnyHill, Pretoria."); 
//        
        
//        System.out.println("Name: " + emp1.firstName);
//        System.out.println("Surname: " + emp1.lastName);
//        System.out.println("Age: " + emp1.age);
//        System.out.println("Employee ID: " + emp1.empId);
//        System.out.println("Home Address: " + emp1.homeAddress);

        emp1.empDetails();
        System.out.println("\n");
        emp2.empDetails();
        
    }
}
