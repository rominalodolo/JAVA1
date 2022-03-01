/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14.MultipleExceptions;

/**
 *
 * @author rominalodolo
 */
public class MultipleExceptions {
    public static void main(String[] args) {
        try{
            createFile();
        } catch (IOException ioe){
            System.out.println(ioe);
        } catch (IllegalArgumentException iae){
            System.out.println(iae);
        } catch (Exception e){
            System.out.println(e);
        }
    }
        
    public void createFile() throws Exception{
        File testF = new File("textFile.txt");
        File tempF = testF.createTempFile("te", null, testF);
        System.out.println("Temp filename: " + tempF.getPath());
        int myInt[] = new int[5];
        myInt[5] = 25
       
    }
}
