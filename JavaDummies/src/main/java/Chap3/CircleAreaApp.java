/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap3;
import java.util.Scanner;
/**
 *
 * @author rominalodolo
 */
public class CircleAreaApp {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println(
            "Welcome to the circle area calculator.");
        System.out.print("Enter the radius of your circle: ");
        double r = sc.nextDouble();
        double area = Math.PI * (r * r);	
        System.out.println("The area is " + area);
    }
}
