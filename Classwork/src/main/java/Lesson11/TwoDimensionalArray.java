/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11;

/**
 *
 * @author rominalodolo
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] yearlySales = new int[4][4];
        int year = 1;
        
        yearlySales[0][0] = 1000;
        yearlySales[0][1] = 2000;
        yearlySales[0][2] = 3000;
        yearlySales[0][3] = 4000;
        yearlySales[1][0] = 5000;
        yearlySales[1][1] = 6000;
        yearlySales[1][2] = 7000;
        yearlySales[1][3] = 8000;
        yearlySales[2][0] = 9000;
        yearlySales[2][1] = 11000;
        yearlySales[2][2] = 12000;
        yearlySales[2][3] = 13000;
        yearlySales[3][0] = 14000;
        yearlySales[3][1] = 15000;
        yearlySales[3][2] = 16000;
        yearlySales[3][3] = 17000;
        
        for(int i = 0; i < yearlySales.length; i++){
            System.out.println("Year " + year + ":");
            year++;
            for(int j = 0; j < yearlySales[i].length; j++)
                System.out.println("\t" +yearlySales[i][j]);
                }
    }
}
