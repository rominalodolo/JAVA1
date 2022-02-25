/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author rominalodolo
 */
public class LocalDateObject {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        LocalTime myTime = LocalTime.now();
        JapaneseDate jdate = JapaneseDate.from(myDate);
        String sDate = myDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        
        System.out.println("Today's Date: " + myDate);
        System.out.println("Today's Date & Time: " + myDateTime);
        System.out.println("Today's Time: " + myTime);
        System.out.println("Japanese Date: " + jdate);
        System.out.println("Today's date plus 15 months: " + myDate.plusMonths(15));
        System.out.println("Today's date minus 5 months: " + myDate.minusMonths(5));
        System.out.println("ISO Date Time format: " + sDate);
    }
}
