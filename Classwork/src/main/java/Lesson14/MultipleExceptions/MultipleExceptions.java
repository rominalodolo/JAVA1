/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.MultipleExceptions;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author rominalodolo
 */
public class MultipleExceptions {
    public static void main(String[] args) {
        try{
            createFile();
        } catch (IOException ioe){
            String errorMessage = ioe.getMessage();
            System.out.println(ioe);
        } catch (IllegalArgumentException iae){
            String errorMessage = iae.getMessage();
            System.out.println(iae);
        } catch (Exception e){
            String errorMessage = e.getMessage();
            System.out.println(e);
        }
    }
        
    public static void createFile() throws Exception{
        File testF = new File("textFile.txt");
        File tempF = testF.createTempFile("te", null, testF);
        System.out.println("Temp filename: " + tempF.getPath());
        int myInt[] = new int[5];
        myInt[5] = 25;
        System.out.println(myInt[5]);
                        
                       
       
    }
}
