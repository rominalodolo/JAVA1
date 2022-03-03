/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author rominalodolo
 */
public class JustLooping {

    private int j;
    void showJ(){
        while(j <= 5){
            for(int J=1; J <= 5;){
                System.out.print(J + " ");
                J++;
            }
            j++;
        }
    }
    
    public static void main(String[] args){
        new JustLooping().showJ();
    }
}

// Answer: COMPILATION ERROR 