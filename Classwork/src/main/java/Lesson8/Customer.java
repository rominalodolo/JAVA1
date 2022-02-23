/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8;

/**
 *
 * @author rominalodolo
 */
public class Customer {

    private String firstName;
    private String lastName;
    private int cusId;
    private String birthday;
    private String email;

    public Customer(String firstName, String lastName, int cusId, String birthday, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cusId = cusId;
        this.birthday = birthday;
        this.email = email;
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

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cusDetails() {
        System.out.println("Name: " + firstName);
        System.out.println("Surname: " + lastName);
        System.out.println("Birthday: " + birthday);
        System.out.println("Customer ID: " + cusId);
        System.out.println("Email Address: " + email);
    }

    
    public void checkBannedCustomers(String surname) {
        if((cuslastName == lastName)){
            System.out.println("This customer is banned: " + lastName);
        }
    }
}
