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
public class HumanResource extends Employee{
    private boolean recruitment;
    private int yearsOfExperience;

    public HumanResource(boolean recruitment, int yearsOfExperience, String firstName, String lastName, int empID, String address, String title, double annualIncome) {
        super(firstName, lastName, empID, address, title, annualIncome);
        this.recruitment = recruitment;
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isRecruitment() {
        return recruitment;
    }

    public void setRecruitment(boolean recruitment) {
        this.recruitment = recruitment;
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
            System.out.println("Recruitment: " + isRecruitment());
            System.out.println("Years of Experience: " + getYearsOfExperience());
    }
}
