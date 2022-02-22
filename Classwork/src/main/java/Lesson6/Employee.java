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
public class Employee {

    private String firstName;
    private String lastName;
    private int empId;
    private int age;
    private String homeAddress;

    public Employee(String firstName, String lastName, int empId, int age, String homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empId = empId;
        this.age = age;
        this.homeAddress = homeAddress;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void empDetails(){
        System.out.println("Name: " + firstName);
        System.out.println("Surname: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Home Address: " + homeAddress);
    }
}
