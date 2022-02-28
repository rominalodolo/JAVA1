/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12;

/**
 *
 * @author rominalodolo
 */
public class Employee {
        private String firstName;
        private String lastName;
        private int empID;
        private String address;
        private String title;
        private double annualIncome;

    public Employee(String firstName, String lastName, int empID, String address, String title, Double annualIncome) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empID = empID;
        this.address = address;
        this.title = title;
        this.annualIncome = annualIncome;
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

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
        
    public void print(){
        System.out.println("Name: " +  getFirstName());
        System.out.println("Last Name: " +  getLastName());
        System.out.println("Employee ID: " +  getEmpID());
        System.out.println("Address: " +  getAddress());
        System.out.println("Title: " +  getTitle());
        System.out.println("Annual Income: " +  getFirstName());
    }
            
}

