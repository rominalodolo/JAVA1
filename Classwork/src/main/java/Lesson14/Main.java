/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14;

/**
 *
 * @author rominalodolo
 */
public class Main {
    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
            
        try{
            ep.doThis();   
        }catch(Exception e){
            String errorMessage = e.getMessage();
            System.out.println(errorMessage);
        }
    }
}
