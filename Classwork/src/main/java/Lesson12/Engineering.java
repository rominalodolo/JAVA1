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
public class Engineering extends Employee {
    private boolean fullstack;
    private int yearsOfExperience;

    public Engineering(boolean fullstack, int yearsOfExperience, String firstName, String lastName, int empID, String address, String title, double annualIncome) {
        super(firstName, lastName, empID, address, title, annualIncome);
        this.fullstack = fullstack;
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isFullstack() {
        return fullstack;
    }

    public void setFullstack(boolean fullstack) {
        this.fullstack = fullstack;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void print() {
    super.print();
            System.out.println("Full stack: " + isFullstack());
            System.out.println("Years of Experience: " + getYearsOfExperience());
    }
}

