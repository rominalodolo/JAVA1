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
public class Sales extends EmploymentStatus {
    @Override
    public void getEmployeeStatus(boolean FullTime) {
        System.out.println("Full-Time: " + FullTime);
    }
}
