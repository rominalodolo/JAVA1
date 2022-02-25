/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 *
 * @author rominalodolo
 */
public class LocalDateObject {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        
        System.out.println("Today's Date: " + myDate);
        System.out.println("Today's Date & Time: " +myDateTime);
    }
}
